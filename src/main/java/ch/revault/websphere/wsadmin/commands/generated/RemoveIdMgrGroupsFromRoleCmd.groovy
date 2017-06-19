/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes the groups from the specified virtual member manager role. If value for groupId parameter is specified as "*" all groups mapped for the role are removed.
*/
@Generated("with GenerateAdminCommands")
class RemoveIdMgrGroupsFromRoleCmd extends AdminCmd<Void> {
    RemoveIdMgrGroupsFromRoleCmd() {
        super("removeIdMgrGroupsFromRole")
    }

    /**
     * Name of the role: IdMgrAdmin, IdMgrWriter, or IdMgrReader.
     */
    def 'roleName'(String value) {
        parameter("roleName", value)
    }

    /**
     * cn or UniqueName of group or a special subject. If cn is provided it should correspond to a unique group. The value allowed for a special subject is "ALLAUTHENTICATED".
     */
    def 'groupId'(String value) {
        parameter("groupId", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
