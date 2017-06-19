/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the configuration of the password encryption. Note that the original value is unchanged unless the value is set by the parameter. To change the value to the default, use a blank string ("").
*/
@Generated("with GenerateAdminCommands")
class ModifyPasswordEncryptionCmd extends AdminCmd<Void> {
    ModifyPasswordEncryptionCmd() {
        super("modifyPasswordEncryption")
    }

    /**
     * Supplies the path name for the passwordUtil.properties file of the client enviroment to be modified. The properties file must exist in the specified location. Do not set the value for the server environment because the location of the properties files are predefined as CONFIG_ROOT/cells/cellName and cannot be changed.
     */
    def 'clientPropsLocation'(String value) {
        parameter("clientPropsLocation", value)
    }

    /**
     * Sets the default password encoding algorithm. The available values are custom when custom encryption is enabled, xor, or aes. The default is aes.
     */
    def 'defaultAlgorithm'(String value) {
        parameter("defaultAlgorithm", value)
    }

    /**
     * Sets the fully qualified keystore file name. This file must exist. The default keystore file name is in the passwordUtil.properties file.
     */
    def 'aesKeystore'(String value) {
        parameter("aesKeystore", value)
    }

    /**
     * Supplies a new password for the AES keystore file.
     */
    def 'aesNewKeystorePassword'(String value) {
        parameter("aesNewKeystorePassword", value)
    }

    /**
     * Supplies the alias name of the key for AES encryption. The default is the newest key that was generated in the cell. Acceptable characters for the alias name are alphanumeric characters. Alphabetic characters must be lowercase. Any alphabetic uppercase characters are converted to lowercase.
     */
    def 'aesCurrentAlias'(String value) {
        parameter("aesCurrentAlias", value)
    }

    /**
     * Supplies the custom AES Key Manager class name.
     */
    def 'aesCustomKeyManager'(String value) {
        parameter("aesCustomKeyManager", value)
    }

    /**
     * Specifies whether the default encoding algorithm encrypts all the passwords in the config directory. The default is true.
     */
    def 'updatePws'(Boolean value) {
        parameter("updatePws", value)
    }

}
