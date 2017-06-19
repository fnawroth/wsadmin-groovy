/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a Key Sets attributes.
*/
@Generated("with GenerateAdminCommands")
class ModifyKeySetCmd extends AdminCmd<Void> {
    ModifyKeySetCmd() {
        super("modifyKeySet")
    }

    /**
     * Specifies the name that uniquely identifies a key set.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specifies the key alias prefix name.
     */
    def 'aliasPrefix'(String value) {
        parameter("aliasPrefix", value)
    }

    /**
     * Specifies the password for the key.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * Specifies the maximum number of keys Stored.
     */
    def 'maxKeyReferences'(Integer value) {
        parameter("maxKeyReferences", value)
    }

    /**
     * Specify true to delete old keys during key generation, false to retain old keys.
     */
    def 'deleteOldKeys'(Boolean value) {
        parameter("deleteOldKeys", value)
    }

    /**
     * Specifies the class used to generate keys.
     */
    def 'keyGenerationClass'(String value) {
        parameter("keyGenerationClass", value)
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the keystore.
     */
    def 'keyStoreScopeName'(String value) {
        parameter("keyStoreScopeName", value)
    }

    /**
     * Specify true if the key set is a key pair, false otherwise.
     */
    def 'isKeyPair'(Boolean value) {
        parameter("isKeyPair", value)
    }

}
