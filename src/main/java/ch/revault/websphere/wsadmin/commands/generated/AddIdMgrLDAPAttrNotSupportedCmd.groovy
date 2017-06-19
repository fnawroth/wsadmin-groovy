/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a configuration for a virtual member manager property not supported by a specific LDAP repository.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrLDAPAttrNotSupportedCmd extends AdminCmd<Void> {
    AddIdMgrLDAPAttrNotSupportedCmd() {
        super("addIdMgrLDAPAttrNotSupported")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of a virtual member manager property not supported by LDAP repository.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
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
