/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to delete members from a target group.
*/
@Generated("with GenerateAdminCommands")
class DeleteMemberFromTargetGroupCmd extends AdminCmd<Void> {
    DeleteMemberFromTargetGroupCmd() {
        super("deleteMemberFromTargetGroup")
    }

    /**
     * The name of the target group.
     */
    def 'groupName'(java.lang.String value) {
        parameter("groupName", value)
    }

    /**
     * List of target names.
     */
    def 'targetNameList'(java.lang.String[] value) {
        parameter("targetNameList", value)
    }

}
