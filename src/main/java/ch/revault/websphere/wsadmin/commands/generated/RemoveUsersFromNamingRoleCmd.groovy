/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove users from a naming role.
*/
@Generated("with GenerateAdminCommands")
class RemoveUsersFromNamingRoleCmd extends AdminCmd<Void> {
    RemoveUsersFromNamingRoleCmd() {
        super("removeUsersFromNamingRole")
    }

    /**
     * Name of the Naming role: <CosNamingRead | CosNamingWrite | CosNamingCreate | CosNamingDelete>
     */
    def 'roleName'(String value) {
        parameter("roleName", value)
    }

    /**
     * User names
	To add multiple values use space separated names enclosed by quotes(" ")
	Example: -userids "user1 user2"
     */
    def 'userids'(java.lang.String[] value) {
        parameter("userids", value)
    }

}
