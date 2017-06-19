/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the uniqueName of groups for each role.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrGroupsForRolesCmd extends AdminCmd<Void> {
    ListIdMgrGroupsForRolesCmd() {
        super("listIdMgrGroupsForRoles")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
