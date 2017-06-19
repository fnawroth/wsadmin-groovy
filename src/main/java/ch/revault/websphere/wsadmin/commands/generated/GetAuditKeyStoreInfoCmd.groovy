/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Shows information about a particular key store.
*/
@Generated("with GenerateAdminCommands")
class GetAuditKeyStoreInfoCmd extends AdminCmd<Void> {
    GetAuditKeyStoreInfoCmd() {
        super("getAuditKeyStoreInfo")
    }

    /**
     * Specifies the unique name to identify the key store.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the management scope
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
