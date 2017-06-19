/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an existing keystore.
*/
@Generated("with GenerateAdminCommands")
class DeleteKeyStoreCmd extends AdminCmd<Void> {
    DeleteKeyStoreCmd() {
        super("deleteKeyStore")
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to remove the keystore file or false to leave the keystore file.
     */
    def 'removeKeyStoreFile'(Boolean value) {
        parameter("removeKeyStoreFile", value)
    }

}
