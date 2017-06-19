/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to list members of a group of managed nodes. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class GetManagedNodeGroupMembersCmd extends AdminCmd<Void> {
    GetManagedNodeGroupMembersCmd() {
        super("getManagedNodeGroupMembers")
    }

    /**
     * A list of group names.
     */
    def 'groupName'(java.lang.String[] value) {
        parameter("groupName", value)
    }

}
