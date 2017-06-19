/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a user from the specified role in the default security space role.
*/
@Generated("with GenerateAdminCommands")
class RemoveUserFromDefaultRoleCmd extends AdminCmd<Void> {
    RemoveUserFromDefaultRoleCmd() {
        super("removeUserFromDefaultRole")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The role name.  Allowable values are ( Sender | Receiver | Browser | Creator | IdentityAdopter )
     */
    def 'role'(String value) {
        parameter("role", value)
    }

    /**
     * User name
     */
    def 'user'(String value) {
        parameter("user", value)
    }

}
