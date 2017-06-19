/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a group from the specified foreign bus role for the bus specified
*/
@Generated("with GenerateAdminCommands")
class RemoveGroupFromForeignBusRoleCmd extends AdminCmd<Void> {
    RemoveGroupFromForeignBusRoleCmd() {
        super("removeGroupFromForeignBusRole")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Foreign Bus name
     */
    def 'foreignBus'(String value) {
        parameter("foreignBus", value)
    }

    /**
     * The role name.  Allowable values are ( Sender | IdentityAdopter )
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

}
