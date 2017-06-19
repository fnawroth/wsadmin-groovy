/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin

import ch.revault.websphere.wsadmin.commands.*
import org.slf4j.LoggerFactory

import java.util.logging.LogManager

class Script implements GeneratedScript{
    static {
        LogManager.getLogManager().reset()
    }
    final def logger = LoggerFactory.getLogger(getClass())

    def client = new Client()

    def adminCommand(@DelegatesTo(AdminCmd) block) {
        runDelegate(new AdminCmd(), block)
    }
    def modifyDatasourceMappingModule(@DelegatesTo(ModifyDatasourceMappingModuleCmd) block) {
        runDelegate(new ModifyDatasourceMappingModuleCmd(), block)
    }
    def createWorkManagerInfo(@DelegatesTo(CreateWorkManagerInfoCmd) block) {
        runDelegate(new CreateWorkManagerInfoCmd(), block)
    }
    def deleteWorkManagerInfo(@DelegatesTo(DeleteWorkManagerInfoCmd) block) {
        runDelegate(new DeleteWorkManagerInfoCmd(), block)
    }
    def connect(@DelegatesTo(CommandConnect) block) {
        runDelegate(new CommandConnect(), block)
    }
    def scriptScope(String scope) {
        client.setScope(scope)
    }
    def save(@DelegatesTo(SaveCmd) block) {
        runDelegate(new SaveCmd(), block)
    }
    def generateCode() {
        runDelegate(new GenerateAdminCommands(), null)
    }

    @Override
    def runDelegate(Command cmd, Closure<?> block) {
        try {
            if (block) {
                block.delegate = cmd
                block()
            }
            if (logger.isDebugEnabled()) {
                logger.debug("Running commmand: ${cmd}")
            } else {
                logger.info("Running command: ${cmd.commandName()}")
            }
            Tuple2<Client,Object> nc = cmd.execute(client)
            client = nc.getFirst() ?: client
            nc.getSecond()
        } catch (Exception e) {
            if (cmd.failOnError()) {
                throw e
            } else {
                logger.error("error in command ${cmd.commandName()} ${e.message}")
            }
        }
    }

    static def wsadmin(@DelegatesTo(Script) block) {
        if (!(System.properties["java.vendor"].toString()?:"").contains("IBM")) {
            throw new IllegalStateException("You must use an IBM JDK!")
        }
        LogManager.getLogManager().reset()
        def script = new Script()
        block.delegate = script
        block()
    }
}
