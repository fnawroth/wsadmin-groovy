/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies a Keystore object.
*/
@Generated("with GenerateAdminCommands")
class ModifyKeyStoreCmd extends AdminCmd<Void> {
    ModifyKeyStoreCmd() {
        super("modifyKeyStore")
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
     * Specifies one of the predefined keystore types.
     */
    def 'keyStoreType'(String value) {
        parameter("keyStoreType", value)
    }

    /**
     * Specifies the location of the keystore file.
     */
    def 'keyStoreLocation'(String value) {
        parameter("keyStoreLocation", value)
    }

    /**
     * Specifies the password to open the keystore.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * Keystore is File Based
     */
    def 'keyStoreIsFileBased'(Boolean value) {
        parameter("keyStoreIsFileBased", value)
    }

    /**
     * Specifies whether the keystore needs to be initialized at server startup or not.
     */
    def 'keyStoreInitAtStartup'(Boolean value) {
        parameter("keyStoreInitAtStartup", value)
    }

    /**
     * Specifies whether the keystore can be written to or not.
     */
    def 'keyStoreReadOnly'(Boolean value) {
        parameter("keyStoreReadOnly", value)
    }

    /**
     * Statement that describes the keystore.
     */
    def 'keyStoreDescription'(String value) {
        parameter("keyStoreDescription", value)
    }

    /**
     * Specifies the provider for the keystore.
     */
    def 'keyStoreProvider'(String value) {
        parameter("keyStoreProvider", value)
    }

    /**
     * What the key store can be used for.
     */
    def 'keyStoreUsage'(String value) {
        parameter("keyStoreUsage", value)
    }

}
