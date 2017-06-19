/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes a LDAP attribute configuration data for a specified entity type for a specific LDAP repository. Use the name of either the LDAP attribute or virtual member manager property.
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrLDAPAttrCmd extends AdminCmd<Void> {
    DeleteIdMgrLDAPAttrCmd() {
        super("deleteIdMgrLDAPAttr")
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
     * The name of the LDAP attribute.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name of the corresponding virtual member manager property mapped to the LDAP attribute.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

    /**
     * The name of the LDAP entity type or a semicolon separated list of LDAP entity types.
     */
    def 'entityTypes'(String value) {
        parameter("entityTypes", value)
    }

}
