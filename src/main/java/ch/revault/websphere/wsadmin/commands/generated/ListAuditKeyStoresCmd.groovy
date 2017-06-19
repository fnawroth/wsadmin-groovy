/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists Audit keystores
*/
@Generated("with GenerateAdminCommands")
class ListAuditKeyStoresCmd extends AdminCmd<Void> {
    ListAuditKeyStoresCmd() {
        super("listAuditKeyStores")
    }

    /**
     * Specifies the management scope
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to list all key stores.  Overrides the scopeName parameter when true.
     */
    def 'all'(Boolean value) {
        parameter("all", value)
    }

}
