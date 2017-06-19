/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets up the LDAP group configuration.
*/
@Generated("with GenerateAdminCommands")
class SetIdMgrLDAPGroupConfigCmd extends AdminCmd<Void> {
    SetIdMgrLDAPGroupConfigCmd() {
        super("setIdMgrLDAPGroupConfig")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Whether or not virtual member manager LDAP adapter needs to update group membership if the member is deleted or renamed. Some LDAP servers, like Domino, Sun ONE, IDS on zOS, do not clean up a user's membership when a user is deleted or renamed. If these LDAP server types are chosen in the ldapServerType property, the value of this parameter is set to "true". Set this property only if the value needs to change. 
     */
    def 'updateGroupMembership'(Boolean value) {
        parameter("updateGroupMembership", value)
    }

    /**
     * The name of the membership attribute. For example, memberOf in Active Directory Server and ibm-allGroups in IDS.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The scope of the membership attribute. One of the three values: "direct", "nested" and "all". direct: The membership attribute contains direct groups only. direct: groups are the groups that contain the member, not contained through nested group. For example, if Group1 contains Group2, Group2 contains User1, then Group2 is a direct group of User1, but Group1 is not a direct group of User1. nested: The membership attribute contains both direct groups and nested groups. all: The membership attribute contains direct groups, nested groups and dynamic members.
     */
    def 'scope'(String value) {
        parameter("scope", value)
    }

}
