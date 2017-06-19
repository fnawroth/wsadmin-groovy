/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove a variable definition from the system. A variable is a configuration property that can be used to provide a parameter for some values in the system.
*/
@Generated("with GenerateAdminCommands")
class RemoveVariableCmd extends AdminCmd<Void> {
    RemoveVariableCmd() {
        super("removeVariable")
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

}
