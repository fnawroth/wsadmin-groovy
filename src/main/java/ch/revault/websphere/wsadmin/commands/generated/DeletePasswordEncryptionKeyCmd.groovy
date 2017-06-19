/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an AES encryption key from the keystore file. This command is disabled when the custom KeyManager class is used.
*/
@Generated("with GenerateAdminCommands")
class DeletePasswordEncryptionKeyCmd extends AdminCmd<Void> {
    DeletePasswordEncryptionKeyCmd() {
        super("deletePasswordEncryptionKey")
    }

    /**
     * Supplies the path name for the passwordUtil.properties file of the client enviroment that specifies the location of the keystore file. The properties file must exist in the specified location. Do not set the value for the server environment because the location of the properties files are predefined as CONFIG_ROOT/cells/cellName and cannot be changed.
     */
    def 'clientPropsLocation'(String value) {
        parameter("clientPropsLocation", value)
    }

    /**
     * Supplies the alias name of the key to be deleted.
     */
    def 'aesAlias'(String value) {
        parameter("aesAlias", value)
    }

}
