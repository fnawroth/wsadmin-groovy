/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a group from all roles defined.
*/
@Generated("with GenerateAdminCommands")
class RemoveGroupFromAllRolesCmd extends AdminCmd<Void> {
    RemoveGroupFromAllRolesCmd() {
        super("removeGroupFromAllRoles")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Group name
     */
    def 'group'(String value) {
        parameter("group", value)
    }

}
