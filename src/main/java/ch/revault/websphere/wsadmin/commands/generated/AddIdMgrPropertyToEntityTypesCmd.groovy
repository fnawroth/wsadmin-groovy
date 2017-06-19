/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a property to one or more entity types either into repositories or into the property extension repository.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrPropertyToEntityTypesCmd extends AdminCmd<Void> {
    AddIdMgrPropertyToEntityTypesCmd() {
        super("addIdMgrPropertyToEntityTypes")
    }

    /**
     * Name of the new property being added to one or more existing entity types.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Names of one or more existing entity types. Use ';' as delimiter while specifying multiple entity types. A valid namespace prefix can be used to refer to entity type names in a specific namespace.
     */
    def 'entityTypeNames'(String value) {
        parameter("entityTypeNames", value)
    }

    /**
     * Data type of the property.
     */
    def 'dataType'(String value) {
        parameter("dataType", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Namespace to which this new property must be added. If nothing is specified then it is added to the default namespace.
     */
    def 'nsURI'(String value) {
        parameter("nsURI", value)
    }

    /**
     * The prefix that must be added to the namespace URI.
     */
    def 'nsPrefix'(String value) {
        parameter("nsPrefix", value)
    }

    /**
     * A boolean that indicates whether the new property can accept more than one value.
     */
    def 'isMultiValued'(Boolean value) {
        parameter("isMultiValued", value)
    }

    /**
     * Identifiers of the repositories for which the new property should be added. If not specified, the new property will be added for all the repositories. Use repository ID 'LA' for property extension repository. Use ';' as delimiter while specifying multiple repository IDs.
     */
    def 'repositoryIds'(String value) {
        parameter("repositoryIds", value)
    }

    /**
     * Required entity type for which a property is required. Use ';' as delimiter while specifying multiple entity types.
     */
    def 'requiredEntityTypeNames'(String value) {
        parameter("requiredEntityTypeNames", value)
    }

    /**
     * Indicates the ID of the application that extends the property.
     */
    def 'applicationId'(String value) {
        parameter("applicationId", value)
    }

}
