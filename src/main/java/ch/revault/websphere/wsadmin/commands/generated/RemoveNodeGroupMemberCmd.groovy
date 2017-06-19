/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* remove a member from the node group.
*/
@Generated("with GenerateAdminCommands")
class RemoveNodeGroupMemberCmd extends AdminCmd<Void> {
    RemoveNodeGroupMemberCmd() {
        super("removeNodeGroupMember")
    }

    /**
     * the name of the node to be removed from the node group
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
