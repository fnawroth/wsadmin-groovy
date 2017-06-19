/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds an LDAP attribute configuration to the LDAP repository configuration.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrLDAPAttrCmd extends AdminCmd<Void> {
    AddIdMgrLDAPAttrCmd() {
        super("addIdMgrLDAPAttr")
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
     * The syntax of the LDAP attribute.
     */
    def 'syntax'(String value) {
        parameter("syntax", value)
    }

    /**
     * The default value of the LDAP attribute.
     */
    def 'defaultValue'(String value) {
        parameter("defaultValue", value)
    }

    /**
     * The default attribute name of the LDAP attribute.
     */
    def 'defaultAttr'(String value) {
        parameter("defaultAttr", value)
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
