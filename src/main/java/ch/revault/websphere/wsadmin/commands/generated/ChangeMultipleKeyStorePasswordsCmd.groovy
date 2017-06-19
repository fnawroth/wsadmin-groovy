/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Change all the passwords for the keystores that use the password provided, which automatically saves the new passwords to the configuration.
*/
@Generated("with GenerateAdminCommands")
class ChangeMultipleKeyStorePasswordsCmd extends AdminCmd<Void> {
    ChangeMultipleKeyStorePasswordsCmd() {
        super("changeMultipleKeyStorePasswords")
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
