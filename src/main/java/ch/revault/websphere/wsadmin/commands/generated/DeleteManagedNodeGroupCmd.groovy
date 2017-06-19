/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to delete a group of managed nodes. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class DeleteManagedNodeGroupCmd extends AdminCmd<Void> {
    DeleteManagedNodeGroupCmd() {
        super("deleteManagedNodeGroup")
    }

    /**
     * A list of group names.
     */
    def 'groupNameList'(java.lang.String[] value) {
        parameter("groupNameList", value)
    }

}
