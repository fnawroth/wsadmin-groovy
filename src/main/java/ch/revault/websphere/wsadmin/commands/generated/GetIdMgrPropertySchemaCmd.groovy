/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Retrieves the property schema of an entity type. If repository ID is not specified then it returns the default property schema supported by virtual member manager. If propertyNames is not specified it returns schema of all the properties. If entity type is not specified then it retrieves the property schema for all entity types. If propertyNames is specified then entityTypeName must be specified.
*/
@Generated("with GenerateAdminCommands")
class GetIdMgrPropertySchemaCmd extends AdminCmd<Void> {
    GetIdMgrPropertySchemaCmd() {
        super("getIdMgrPropertySchema")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Names of one or more properties. Use ';' as the delimiter while specifying multiple property names. A valid namespace prefix must be used to refer to the property names if they do not belong to the default namespace.
     */
    def 'propertyNames'(String value) {
        parameter("propertyNames", value)
    }

    /**
     * Name of the entity type. A valid namespace prefix must be used to refer to the entity type if it does not belong to the default namespace.
     */
    def 'entityTypeName'(String value) {
        parameter("entityTypeName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
