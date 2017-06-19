/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Disables the configuration of the password encryption. As a result, the values of xor or custom are used for the encryption algorithm.
*/
@Generated("with GenerateAdminCommands")
class DisablePasswordEncryptionCmd extends AdminCmd<Void> {
    DisablePasswordEncryptionCmd() {
        super("disablePasswordEncryption")
    }

    /**
     * Supplies the path name for the passwordUtil.properties file of the client enviroment to be disabled. The properties file must exist in the specified location. Do not set the value for the server environment because the location of the properties files are predefined as CONFIG_ROOT/cells/cellName and cannot be changed.
     */
    def 'clientPropsLocation'(String value) {
        parameter("clientPropsLocation", value)
    }

    /**
     * Sets the default password encoding algorithm. The available values are xor or custom when custom encryption is enabled. The default value is xor. This value is ignored when the deleteAesFiles parameter is not set or is set as true.
     */
    def 'defaultAlgorithm'(String value) {
        parameter("defaultAlgorithm", value)
    }

    /**
     * Deletes the passwordUtil.properties file and the associated AES keystore file. The default is true.
     */
    def 'deleteAesFiles'(Boolean value) {
        parameter("deleteAesFiles", value)
    }

    /**
     * Specifies whether the default encoding algorithm encrypts all the passwords in the config directory. The default is true.
     */
    def 'updatePws'(Boolean value) {
        parameter("updatePws", value)
    }

}
