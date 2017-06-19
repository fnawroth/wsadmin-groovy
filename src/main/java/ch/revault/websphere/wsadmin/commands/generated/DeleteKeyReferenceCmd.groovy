/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing Key Reference from a keySet.
*/
@Generated("with GenerateAdminCommands")
class DeleteKeyReferenceCmd extends AdminCmd<Void> {
    DeleteKeyReferenceCmd() {
        super("deleteKeyReference")
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

    /**
     * Specifies the unique name that identifies the key.
     */
    def 'keyAlias'(String value) {
        parameter("keyAlias", value)
    }

}
