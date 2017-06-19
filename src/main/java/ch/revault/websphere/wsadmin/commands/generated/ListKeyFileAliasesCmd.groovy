/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List personal certificate aliases in a keystore file
*/
@Generated("with GenerateAdminCommands")
class ListKeyFileAliasesCmd extends AdminCmd<Void> {
    ListKeyFileAliasesCmd() {
        super("listKeyFileAliases")
    }

    /**
     * Specifies the full path to the keystore file.
     */
    def 'keyFilePath'(String value) {
        parameter("keyFilePath", value)
    }

    /**
     * Specifies the password to the keystore file.
     */
    def 'keyFilePassword'(String value) {
        parameter("keyFilePassword", value)
    }

    /**
     * Specifies the type of the keystore file.
     */
    def 'keyFileType'(String value) {
        parameter("keyFileType", value)
    }

}
