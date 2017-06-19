/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to list members of a target group.
*/
@Generated("with GenerateAdminCommands")
class GetTargetGroupMembersCmd extends AdminCmd<Void> {
    GetTargetGroupMembersCmd() {
        super("getTargetGroupMembers")
    }

    /**
     * The name of the target group.
     */
    def 'groupName'(java.lang.String[] value) {
        parameter("groupName", value)
    }

}
