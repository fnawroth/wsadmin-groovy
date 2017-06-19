/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove groupids from one or more audit role in the AuthorizationGroup.
*/
@Generated("with GenerateAdminCommands")
class RemoveGroupsFromAuditRoleCmd extends AdminCmd<Void> {
    RemoveGroupsFromAuditRoleCmd() {
        super("removeGroupsFromAuditRole")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

    /**
     * Name of the role.  < administrator | configurator | operator | deployer | monitor >
     */
    def 'roleName'(String value) {
        parameter("roleName", value)
    }

    /**
     * Group ID.
     */
    def 'groupids'(java.lang.String[] value) {
        parameter("groupids", value)
    }

    /**
     * Special Subject.  <EVERYONE | ALLAUTHENTICATED | ALLAUTHENTICATEDINTRUSTEDREALMS>
     */
    def 'specialSubjects'(java.lang.String[] value) {
        parameter("specialSubjects", value)
    }

}
