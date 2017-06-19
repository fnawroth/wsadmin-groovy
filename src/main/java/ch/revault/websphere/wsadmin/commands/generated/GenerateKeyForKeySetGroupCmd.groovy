/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generate new keys for all the keys within a keySet Group.
*/
@Generated("with GenerateAdminCommands")
class GenerateKeyForKeySetGroupCmd extends AdminCmd<Void> {
    GenerateKeyForKeySetGroupCmd() {
        super("generateKeyForKeySetGroup")
    }

    /**
     * Specifies the name that uniquely identifies the key set group.
     */
    def 'keySetGroupName'(String value) {
        parameter("keySetGroupName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'keySetGroupScope'(String value) {
        parameter("keySetGroupScope", value)
    }

    /**
     * Update the runtime to use the newly generated keys.
     */
    def 'keySetGroupUpdateRuntime'(Boolean value) {
        parameter("keySetGroupUpdateRuntime", value)
    }

    /**
     * Update the runtime to use the newly generated keys.
     */
    def 'keySetGroupSaveConfig'(Boolean value) {
        parameter("keySetGroupSaveConfig", value)
    }

}
