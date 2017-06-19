/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a management scope.
*/
@Generated("with GenerateAdminCommands")
class CreateManagementScopeCmd extends AdminCmd<Void> {
    CreateManagementScopeCmd() {
        super("createManagementScope")
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specifies the management scope type.
     */
    def 'scopeType'(String value) {
        parameter("scopeType", value)
    }

}
