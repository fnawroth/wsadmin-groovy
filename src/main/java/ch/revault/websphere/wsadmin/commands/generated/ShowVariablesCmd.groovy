/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List variable values under a scope.
*/
@Generated("with GenerateAdminCommands")
class ShowVariablesCmd extends AdminCmd<Void> {
    ShowVariablesCmd() {
        super("showVariables")
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
