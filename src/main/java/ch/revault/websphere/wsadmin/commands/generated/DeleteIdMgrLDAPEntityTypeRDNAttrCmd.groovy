/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes RDN attribute configuration from an LDAP entity type configuration.
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrLDAPEntityTypeRDNAttrCmd extends AdminCmd<Void> {
    DeleteIdMgrLDAPEntityTypeRDNAttrCmd() {
        super("deleteIdMgrLDAPEntityTypeRDNAttr")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of the LDAP entity type.
     */
    def 'entityTypeName'(String value) {
        parameter("entityTypeName", value)
    }

    /**
     * The attribute name that is used to build the RDN for this entity type.
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
