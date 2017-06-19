/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the groups in the default role.
*/
@Generated("with GenerateAdminCommands")
class ListGroupsInDefaultRoleCmd extends AdminCmd<Void> {
    ListGroupsInDefaultRoleCmd() {
        super("listGroupsInDefaultRole")
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
     * SHOW_UNIQUE_NAMES_DESCRIPTION
     */
    def 'showUniqueNames'(Boolean value) {
        parameter("showUniqueNames", value)
    }

}
