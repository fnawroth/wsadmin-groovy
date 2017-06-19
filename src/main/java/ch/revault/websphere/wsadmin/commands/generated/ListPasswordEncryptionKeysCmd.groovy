/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Displays the list of key alias names and the current encryption key in the specified keystore file. The first item in the list is the current encryption key.
*/
@Generated("with GenerateAdminCommands")
class ListPasswordEncryptionKeysCmd extends AdminCmd<Void> {
    ListPasswordEncryptionKeysCmd() {
        super("listPasswordEncryptionKeys")
    }

    /**
     * Supplies the path name for the passwordUtil.properties file of the client enviroment that specifies the location of the keystore file. The properties file must exist in the specified location. Do not set the value for the server environment because the location of the properties files are predefined as CONFIG_ROOT/cells/cellName and cannot be changed.
     */
    def 'clientPropsLocation'(String value) {
        parameter("clientPropsLocation", value)
    }

}
