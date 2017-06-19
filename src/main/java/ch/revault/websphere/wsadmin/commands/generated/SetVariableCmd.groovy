/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the value for a variable. A variable is a configuration property that can be used to provide a parameter for some values in the system.
*/
@Generated("with GenerateAdminCommands")
class SetVariableCmd extends AdminCmd<Void> {
    SetVariableCmd() {
        super("setVariable")
    }

    /**
     * Scope of the variable definition.  <Cell | Node | Server | Application | Cluster> default: Cell.
     */
    def 'scope'(String value) {
        parameter("scope", value)
    }

    /**
     * The name of the variable.
     */
    def 'variableName'(String value) {
        parameter("variableName", value)
    }

    /**
     * The value of the variable.
     */
    def 'variableValue'(String value) {
        parameter("variableValue", value)
    }

    /**
     * The description of the variable.
     */
    def 'variableDescription'(String value) {
        parameter("variableDescription", value)
    }

}
