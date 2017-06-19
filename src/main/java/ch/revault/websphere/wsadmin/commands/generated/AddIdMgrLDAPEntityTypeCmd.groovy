/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds an LDAP entity type definition to the LDAP repository configuration.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrLDAPEntityTypeCmd extends AdminCmd<Void> {
    AddIdMgrLDAPEntityTypeCmd() {
        super("addIdMgrLDAPEntityType")
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
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * One or more object classes for the entity type. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'objectClasses'(String value) {
        parameter("objectClasses", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Search filter to use to search this entity type.
     */
    def 'searchFilter'(String value) {
        parameter("searchFilter", value)
    }

    /**
     * Object class to use during creation of an entity type object. If it is the same as the objectClass, you do not need to specify this.
     */
    def 'objectClassesForCreate'(String value) {
        parameter("objectClassesForCreate", value)
    }

    /**
     * Search bases to use while searching the entity type. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'searchBases'(String value) {
        parameter("searchBases", value)
    }

}
