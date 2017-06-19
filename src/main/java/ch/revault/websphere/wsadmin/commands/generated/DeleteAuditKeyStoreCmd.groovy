/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an existing Key Store.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditKeyStoreCmd extends AdminCmd<Void> {
    DeleteAuditKeyStoreCmd() {
        super("deleteAuditKeyStore")
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

    /**
     * Specify true to remove the key store file or false to leave the key store file.
     */
    def 'removeKeyStoreFile'(Boolean value) {
        parameter("removeKeyStoreFile", value)
    }

}
