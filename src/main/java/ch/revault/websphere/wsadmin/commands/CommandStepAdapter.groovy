/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

class CommandStepAdapter extends LinkedHashMap<String, Object>{

    public String stepName

    def stepName(name) {
        this.stepName = name
    }

    def rows(@DelegatesTo(CommandStepAdapterRows) Closure<CommandStepAdapterRows> block) {
        block.delegate = new CommandStepAdapterRows(this)
        block()
    }

    def getStepName() { this.stepName }

}