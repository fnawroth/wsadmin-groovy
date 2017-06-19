/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the member attribute configuration from the LDAP group configuration.
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrLDAPGroupMemberAttrCmd extends AdminCmd<Void> {
    DeleteIdMgrLDAPGroupMemberAttrCmd() {
        super("deleteIdMgrLDAPGroupMemberAttr")
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

}
