/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all Dynamic SSL configuration selections.
*/
@Generated("with GenerateAdminCommands")
class ListDynamicSSLConfigSelectionsCmd extends AdminCmd<Void> {
    ListDynamicSSLConfigSelectionsCmd() {
        super("listDynamicSSLConfigSelections")
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to list all dynamic SSL configuration selections.  True overrides the scopeName parameter.
     */
    def 'all'(Boolean value) {
        parameter("all", value)
    }

}
