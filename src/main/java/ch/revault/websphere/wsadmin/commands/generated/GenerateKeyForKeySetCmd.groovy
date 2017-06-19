/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generate all the keys in a KeySet.
*/
@Generated("with GenerateAdminCommands")
class GenerateKeyForKeySetCmd extends AdminCmd<Void> {
    GenerateKeyForKeySetCmd() {
        super("generateKeyForKeySet")
    }

    /**
     * Specifies the name that uniquely identifies a key set.
     */
    def 'keySetName'(String value) {
        parameter("keySetName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'keySetScope'(String value) {
        parameter("keySetScope", value)
    }

    /**
     * Specify true to automatically save the configuration after adding the key reference, false to save to the configuration with a seperate command.
     */
    def 'keySetSaveConfig'(Boolean value) {
        parameter("keySetSaveConfig", value)
    }

}
