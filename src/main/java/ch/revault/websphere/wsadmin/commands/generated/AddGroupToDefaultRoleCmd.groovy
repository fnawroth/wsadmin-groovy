/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Grants a group default access to all local destinations on the bus for the specified role.
*/
@Generated("with GenerateAdminCommands")
class AddGroupToDefaultRoleCmd extends AdminCmd<Void> {
    AddGroupToDefaultRoleCmd() {
        super("addGroupToDefaultRole")
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
     * Group name
     */
    def 'group'(String value) {
        parameter("group", value)
    }

    /**
     * The name that uniquely defines the user or group in the registry
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

}
