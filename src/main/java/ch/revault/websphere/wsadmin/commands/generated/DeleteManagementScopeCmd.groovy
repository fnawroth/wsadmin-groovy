/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing management scope.
*/
@Generated("with GenerateAdminCommands")
class DeleteManagementScopeCmd extends AdminCmd<Void> {
    DeleteManagementScopeCmd() {
        super("deleteManagementScope")
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
