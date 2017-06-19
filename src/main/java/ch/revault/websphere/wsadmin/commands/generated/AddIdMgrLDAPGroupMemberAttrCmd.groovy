/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a member attribute configuration to the LDAP group configuration.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrLDAPGroupMemberAttrCmd extends AdminCmd<Void> {
    AddIdMgrLDAPGroupMemberAttrCmd() {
        super("addIdMgrLDAPGroupMemberAttr")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of the LDAP attribute that is used as a group member attribute. For example, member or uniqueMember.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The group object class that contains this member attribute. For example, "groupOfNames" or "groupOfUniqueNames". If this property is not defined, this member attribute applies to all group object classes.
     */
    def 'objectClass'(String value) {
        parameter("objectClass", value)
    }

    /**
     * The scope of the member attribute. One of the three values: "direct", "nested" and "all". direct: The member attribute only contains direct members, which means the member directly contained by the group, not contained through nested group. For example, if Group1 contains Group2, Group2 contains User1, then Group2 is a direct member of Group1 but User1 is not a direct member of Group1.  Both member and uniqueMember are direct member attribute. nested: The member attribute contains both direct members and nested members. all: The member attribute contains direct members, nested members and dynamic members. 
     */
    def 'scope'(String value) {
        parameter("scope", value)
    }

    /**
     * When creating a group without member specified, dummy member is filled in to avoid missing mandatory attribute exception. 
     */
    def 'dummyMember'(String value) {
        parameter("dummyMember", value)
    }

}
