/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a member (user or group) to a group.
*/
@Generated("with GenerateAdminCommands")
class AddMemberToGroupCmd extends AdminCmd<Void> {
    AddMemberToGroupCmd() {
        super("addMemberToGroup")
    }

    /**
     * The uniqueName of the member to add or remove.
     */
    def 'memberUniqueName'(String value) {
        parameter("memberUniqueName", value)
    }

    /**
     * The uniqueName of the group.
     */
    def 'groupUniqueName'(String value) {
        parameter("groupUniqueName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
