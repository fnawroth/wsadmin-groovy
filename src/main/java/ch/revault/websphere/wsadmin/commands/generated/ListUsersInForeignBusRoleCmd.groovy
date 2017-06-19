/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the users in the specified role in the foreign bus security space role for the given bus.
*/
@Generated("with GenerateAdminCommands")
class ListUsersInForeignBusRoleCmd extends AdminCmd<Void> {
    ListUsersInForeignBusRoleCmd() {
        super("listUsersInForeignBusRole")
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
     * SHOW_UNIQUE_NAMES_DESCRIPTION
     */
    def 'showUniqueNames'(Boolean value) {
        parameter("showUniqueNames", value)
    }

}
