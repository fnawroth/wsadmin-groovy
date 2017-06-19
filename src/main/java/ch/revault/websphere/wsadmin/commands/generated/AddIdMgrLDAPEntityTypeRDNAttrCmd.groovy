/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds RDN attribute configuration to an LDAP entity type configuration.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrLDAPEntityTypeRDNAttrCmd extends AdminCmd<Void> {
    AddIdMgrLDAPEntityTypeRDNAttrCmd() {
        super("addIdMgrLDAPEntityTypeRDNAttr")
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

    /**
     * The group object class that contains this member attribute. For example, "groupOfNames" or "groupOfUniqueNames". If this property is not defined, this member attribute applies to all group object classes.
     */
    def 'objectClass'(String value) {
        parameter("objectClass", value)
    }

}
