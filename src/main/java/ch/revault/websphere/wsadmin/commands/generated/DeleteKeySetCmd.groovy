/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a key set.
*/
@Generated("with GenerateAdminCommands")
class DeleteKeySetCmd extends AdminCmd<Void> {
    DeleteKeySetCmd() {
        super("deleteKeySet")
    }

    /**
     * Specifies the name that uniquely identifies a key set.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
