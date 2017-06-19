/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a new keystore.
*/
@Generated("with GenerateAdminCommands")
class CreateKeyStoreCmd extends AdminCmd<Void> {
    CreateKeyStoreCmd() {
        super("createKeyStore")
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
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
     * Specifies the confirmation of the password to open the keystore.
     */
    def 'keyStorePasswordVerify'(String value) {
        parameter("keyStorePasswordVerify", value)
    }

    /**
     * Specifies the provider for the keystore.
     */
    def 'keyStoreProvider'(String value) {
        parameter("keyStoreProvider", value)
    }

    /**
     * Keystore is File Based
     */
    def 'keyStoreIsFileBased'(Boolean value) {
        parameter("keyStoreIsFileBased", value)
    }

    /**
     * Specifies a comma separated the list of hosts where the keystore is remotely managed. 
     */
    def 'keyStoreHostList'(String value) {
        parameter("keyStoreHostList", value)
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
     * Specifies whether to stash the keystore password to a file or not.  This only applies to the CMS keystore type.
     */
    def 'keyStoreStashFile'(Boolean value) {
        parameter("keyStoreStashFile", value)
    }

    /**
     * Specify true to enable cryptographic operations on hardware devices.
     */
    def 'enableCryptoOperations'(Boolean value) {
        parameter("enableCryptoOperations", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Statement that describes the keystore.
     */
    def 'keyStoreDescription'(String value) {
        parameter("keyStoreDescription", value)
    }

    /**
     * What the key store can be used for.
     */
    def 'keyStoreUsage'(String value) {
        parameter("keyStoreUsage", value)
    }

    /**
     * Specify this field if creating a writable keystore object for the control regions keyring.
     */
    def 'controlRegionUser'(String value) {
        parameter("controlRegionUser", value)
    }

    /**
     * Specify this field if creating a writable keystore object for the servant regions keyring.
     */
    def 'servantRegionUser'(String value) {
        parameter("servantRegionUser", value)
    }

}
