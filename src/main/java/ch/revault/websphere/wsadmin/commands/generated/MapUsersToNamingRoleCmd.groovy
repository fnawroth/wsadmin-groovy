/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Map users to the naming roles
*/
@Generated("with GenerateAdminCommands")
class MapUsersToNamingRoleCmd extends AdminCmd<Void> {
    MapUsersToNamingRoleCmd() {
        super("mapUsersToNamingRole")
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

    /**
     * AccessIds of the users <user:realmName/uniqueID>
	To add multiple values use space separated names enclosed by quotes(" "). The order of the accessids list should match accordingly with the order of the userids list.
	Example: "user:default/111 user:default/222"
     */
    def 'accessids'(java.lang.String[] value) {
        parameter("accessids", value)
    }

}
