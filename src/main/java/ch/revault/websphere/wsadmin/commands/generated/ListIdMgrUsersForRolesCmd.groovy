/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the uniqueName of users for each role.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrUsersForRolesCmd extends AdminCmd<Void> {
    ListIdMgrUsersForRolesCmd() {
        super("listIdMgrUsersForRoles")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
