/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Change the password of a keystore. This will automatically save the new password to the configuration.
*/
@Generated("with GenerateAdminCommands")
class ChangeKeyStorePasswordCmd extends AdminCmd<Void> {
    ChangeKeyStorePasswordCmd() {
        super("changeKeyStorePassword")
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
     * Specifies the password to open the keystore.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * Specifies the password for the keystore.
     */
    def 'newKeyStorePassword'(String value) {
        parameter("newKeyStorePassword", value)
    }

    /**
     * Specifies the password for the keystore confirm entry.
     */
    def 'newKeyStorePasswordVerify'(String value) {
        parameter("newKeyStorePasswordVerify", value)
    }

}
