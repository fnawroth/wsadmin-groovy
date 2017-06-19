/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a dynamic member attribute configuration to an LDAP group configuration.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrLDAPGroupDynamicMemberAttrCmd extends AdminCmd<Void> {
    AddIdMgrLDAPGroupDynamicMemberAttrCmd() {
        super("addIdMgrLDAPGroupDynamicMemberAttr")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of the LDAP attribute that is used as a group member attribute. For example, memberURL.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The group object class that contains this member attribute. For example, "groupOfNames" or "groupOfUniqueNames". If this property is not defined, this member attribute applies to all group object classes.
     */
    def 'objectClass'(String value) {
        parameter("objectClass", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
