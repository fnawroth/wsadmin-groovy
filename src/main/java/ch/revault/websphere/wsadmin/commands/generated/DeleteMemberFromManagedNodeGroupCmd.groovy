/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to delete members from a group of managed nodes. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class DeleteMemberFromManagedNodeGroupCmd extends AdminCmd<Void> {
    DeleteMemberFromManagedNodeGroupCmd() {
        super("deleteMemberFromManagedNodeGroup")
    }

    /**
     * The name of the group.
     */
    def 'groupName'(String value) {
        parameter("groupName", value)
    }

    /**
     * List of managed node names.
     */
    def 'managedNodeNameList'(java.lang.String[] value) {
        parameter("managedNodeNameList", value)
    }

}
