/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a Key Reference for a keySet.
*/
@Generated("with GenerateAdminCommands")
class CreateKeyReferenceCmd extends AdminCmd<Void> {
    CreateKeyReferenceCmd() {
        super("createKeyReference")
    }

    /**
     * Specifies the name that uniquely identifies a key set.
     */
    def 'keySetName'(String value) {
        parameter("keySetName", value)
    }

    /**
     * Specifies the scope name of the key set.
     */
    def 'keySetScope'(String value) {
        parameter("keySetScope", value)
    }

    /**
     * Specifies the unique name that identifies the key.
     */
    def 'keyAlias'(String value) {
        parameter("keyAlias", value)
    }

    /**
     * Specifies the password for the key.
     */
    def 'keyPassword'(String value) {
        parameter("keyPassword", value)
    }

    /**
     * Specifies the password used to confirm the key password.
     */
    def 'keyPasswordVerify'(String value) {
        parameter("keyPasswordVerify", value)
    }

    /**
     * Specifies the version of the key reference.
     */
    def 'version'(Integer value) {
        parameter("version", value)
    }

    /**
     * Specifies whether to save the configuration after adding the key reference.
     */
    def 'keyReferenceSaveConfig'(Boolean value) {
        parameter("keyReferenceSaveConfig", value)
    }

}
