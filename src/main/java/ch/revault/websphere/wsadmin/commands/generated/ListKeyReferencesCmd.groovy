/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists key references for the keys in a keySet.
*/
@Generated("with GenerateAdminCommands")
class ListKeyReferencesCmd extends AdminCmd<Void> {
    ListKeyReferencesCmd() {
        super("listKeyReferences")
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

}
