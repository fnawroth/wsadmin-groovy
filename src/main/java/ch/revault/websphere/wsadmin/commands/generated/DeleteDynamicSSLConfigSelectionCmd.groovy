/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing Dynamic SSL configuration Selection.
*/
@Generated("with GenerateAdminCommands")
class DeleteDynamicSSLConfigSelectionCmd extends AdminCmd<Void> {
    DeleteDynamicSSLConfigSelectionCmd() {
        super("deleteDynamicSSLConfigSelection")
    }

    /**
     * Specifies the name that uniquely identifies the dynamic SSL configuration selection.
     */
    def 'dynSSLConfigSelectionName'(String value) {
        parameter("dynSSLConfigSelectionName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
