/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generates a new AES password encryption key, sets it as the current key for the encryption, and then updates the passwords with the new key. This command is disabled when the custom KeyManager class is used.
*/
@Generated("with GenerateAdminCommands")
class RegenPasswordEncryptionKeyCmd extends AdminCmd<Void> {
    RegenPasswordEncryptionKeyCmd() {
        super("regenPasswordEncryptionKey")
    }

    /**
     * Supplies the path name for the passwordUtil.properties file of the client enviroment that specifies the location of the keystore file. The properties file must exist in the specified location. Do not set the value for the server environment because the location of the properties files are predefined as CONFIG_ROOT/cells/cellName and cannot be changed.
     */
    def 'clientPropsLocation'(String value) {
        parameter("clientPropsLocation", value)
    }

    /**
     * Supplies the alias name of the key to be generated. The default alias name is the cell name with a timestamp.  Acceptable characters for the alias name are alphanumeric characters. Alphabetic characters must be lowercase. Any alphabetic uppercase characters are converted to lowercase.
     */
    def 'aesAlias'(String value) {
        parameter("aesAlias", value)
    }

    /**
     * Deletes the previous encryption key when this parameter is set to true. The default is false.
     */
    def 'deleteOldKey'(Boolean value) {
        parameter("deleteOldKey", value)
    }

    /**
     * Specifies whether the default encoding algorithm encrypts all the passwords in the config directory. The default is true.
     */
    def 'updatePws'(Boolean value) {
        parameter("updatePws", value)
    }

}
