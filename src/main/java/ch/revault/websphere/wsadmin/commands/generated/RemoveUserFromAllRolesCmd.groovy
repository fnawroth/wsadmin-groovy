/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a user from all roles defined.
*/
@Generated("with GenerateAdminCommands")
class RemoveUserFromAllRolesCmd extends AdminCmd<Void> {
    RemoveUserFromAllRolesCmd() {
        super("removeUserFromAllRoles")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * User name
     */
    def 'user'(String value) {
        parameter("user", value)
    }

}
