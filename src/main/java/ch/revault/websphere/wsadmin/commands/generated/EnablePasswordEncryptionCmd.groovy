/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generates and configures the key file and passwordUtil.properties file, both of which are required for AES password encryption.
*/
@Generated("with GenerateAdminCommands")
class EnablePasswordEncryptionCmd extends AdminCmd<Void> {
    EnablePasswordEncryptionCmd() {
        super("enablePasswordEncryption")
    }

    /**
     * Supplies the path name for the properties files to be created for the client environment. For the server environment, do not set the value because the location of the properties files are predefined as CONFIG_ROOT/cells/cellName and cannot be changed.
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
     * Sets the fully qualified keystore file name. The default file is AESKey.jceks and is located in the directory specified on the clientPropsLocation parameter.
     */
    def 'aesKeystore'(String value) {
        parameter("aesKeystore", value)
    }

    /**
     * Supplies the password for the AES keystore file.
     */
    def 'aesKeystorePassword'(String value) {
        parameter("aesKeystorePassword", value)
    }

    /**
     * Supplies the alias name of the key for AES encryption. The default is the newest key that was generated in the cell. Acceptable characters for the alias name are alphanumeric characters. Alphabetic characters must be lowercase. Any alphabetic uppercase characters are converted to lowercase.
     */
    def 'aesCurrentAlias'(String value) {
        parameter("aesCurrentAlias", value)
    }

    /**
     * Supplies the alias name of the key to be generated. The default alias name is the cell name with a timestamp.  Acceptable characters for the alias name are alphanumeric characters. Alphabetic characters must be lowercase. Any alphabetic uppercase characters are converted to lowercase.
     */
    def 'aesAlias'(String value) {
        parameter("aesAlias", value)
    }

    /**
     * Specifies whether the AES keystore is generated. The default is true.
     */
    def 'aesGenerateKeystore'(Boolean value) {
        parameter("aesGenerateKeystore", value)
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

    /**
     * Specifies whether the existing keystore and properties files are overwritten. The default is false, which means that the files are not overwritten.
     */
    def 'forceGeneration'(Boolean value) {
        parameter("forceGeneration", value)
    }

}
