/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the configuration for an LDAP attribute used as an external ID.
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrLDAPExternalIdAttrCmd extends AdminCmd<Void> {
    DeleteIdMgrLDAPExternalIdAttrCmd() {
        super("deleteIdMgrLDAPExternalIdAttr")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of the LDAP attribute.
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
     * The name of the LDAP entity type or a semicolon separated list of LDAP entity types.
     */
    def 'entityTypes'(String value) {
        parameter("entityTypes", value)
    }

}
