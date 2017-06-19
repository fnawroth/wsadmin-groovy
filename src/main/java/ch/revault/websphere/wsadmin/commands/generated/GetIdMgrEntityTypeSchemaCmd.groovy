/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Retrieves the schema of an entity type. If repository ID is not specified then it returns the default entity type schema supported by virtual member manager. If entity type names are not specified then it retrieves the entity type schema for all the entity types.
*/
@Generated("with GenerateAdminCommands")
class GetIdMgrEntityTypeSchemaCmd extends AdminCmd<Void> {
    GetIdMgrEntityTypeSchemaCmd() {
        super("getIdMgrEntityTypeSchema")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Names of one or more existing entity types. Use ';' as delimiter while specifying multiple entity types. A valid namespace prefix can be used to refer to entity type names in a specific namespace.
     */
    def 'entityTypeNames'(String value) {
        parameter("entityTypeNames", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
