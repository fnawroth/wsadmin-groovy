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
class ModifyAuditKeyStoreCmd extends AdminCmd<Void> {
    ModifyAuditKeyStoreCmd() {
        super("modifyAuditKeyStore")
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
     * Specifies one of the predefined key store types.
     */
    def 'keyStoreType'(String value) {
        parameter("keyStoreType", value)
    }

    /**
     * Specifies the location of the key store file.
     */
    def 'keyStoreLocation'(String value) {
        parameter("keyStoreLocation", value)
    }

    /**
     * Specifies the password to open the key store.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * Specify true if the key store is file based and false if the key store is remotely managed.
     */
    def 'keyStoreIsFileBased'(Boolean value) {
        parameter("keyStoreIsFileBased", value)
    }

    /**
     * Specifies whether the key store needs to be initialized at server startup or not.
     */
    def 'keyStoreInitAtStartup'(Boolean value) {
        parameter("keyStoreInitAtStartup", value)
    }

    /**
     * Specifies whether the key store can be written to or not.
     */
    def 'keyStoreReadOnly'(Boolean value) {
        parameter("keyStoreReadOnly", value)
    }

    /**
     * Statement to describe the key store.
     */
    def 'keyStoreDescription'(String value) {
        parameter("keyStoreDescription", value)
    }

}
