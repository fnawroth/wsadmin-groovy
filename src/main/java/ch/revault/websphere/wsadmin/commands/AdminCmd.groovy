/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import ch.revault.websphere.wsadmin.Client
import com.ibm.websphere.management.cmdframework.CommandMgr
import com.ibm.websphere.management.cmdframework.CommandResult
import com.ibm.websphere.management.cmdframework.CommandStep
import com.ibm.websphere.management.cmdframework.TaskCommand

import javax.management.ObjectName

/**
 * Created by urs on 6/16/2017.
 */
class AdminCmd<T> extends BaseCommand<T>{
    String command
    def target
    List<CommandStepAdapter> steps = []

    def parameters = []
    AdminCmd() {}

    AdminCmd(String command) {
        this.command = command
    }

    AdminCmd(AdminCommandNames command) {
        this.command = command.name()
    }

    def commandName(String command) {
        this.command = command
        this
    }
    def command(AdminCommandNames command) {
        this.command = command.name()
        this
    }
    def target(ObjectName target) {
        this.target = target
        this
    }
    def targetString(String target) {
        this.target = target
        this
    }


    def parameter(name, value) {
        parameters.add([name,value])
        this
    }


    Closure<CommandStepAdapter> step(@DelegatesTo(CommandStepAdapter) block) {
        steps.add(new CommandStepAdapter())
        block.delegate = steps.last()
        block()
    }


    @Override
    Tuple2<Client, T> execute(Client client) {
        def cmd= CommandMgr.getCommandMgr(client.client).createCommand(command)
        parameters.each { cmd.setParameter(it.get(0), it.get(1)) }
        cmd.setConfigSession(client.getSession())
        if (cmd.getCommandMetadata().targetObjectRequired) {
            cmd.setTargetObject(client.getResolvedScope())
        }
        if (target) {
            if (target instanceof String) {
                cmd.setTargetObject(client.configService.resolve(client.getSession(), target)[0])
            } else {
                cmd.setTargetObject(target)
            }
        }

        if (hasScopeMethod() && !cmd.getParameter('scope')) {
            cmd.setParameter('scope', client.getScope())
        }

        if (cmd instanceof  TaskCommand) {
            steps.each { CommandStepAdapter step ->
                CommandStep cmdStep = (cmd as TaskCommand).getCommandStep(step.getStepName())
                (0..cmdStep.numberOfRows -1).each{ i ->
                    def key = cmdStep.getParameter('name', i)
                    def value = step[key]
                    if (value) {
                        cmdStep.setParameter("value", value.toString(), i)
                    }
                }
            }
        }
        cmd.execute()
        CommandResult result = cmd.getCommandResult()

        if (result.getException()) {
            throw result.exception
        }
        return [client, result.result]
    }
    def hasScopeMethod() {
        def method=getClass().getDeclaredMethods().find {
            it.name=="scope" && it.parameterTypes.size()==1 && it.parameterTypes[0].equals(String.class)
        }
        method!=null
    }

    @Override
    String toString() {
        def params= parameters.collect { "    ${it.get(0)} ${it.get(1)}"}.join("\n")
        """
$command {
    target ${target}
${params}
}"""
    }
    @Override
    String commandName() {
        command
    }
}
