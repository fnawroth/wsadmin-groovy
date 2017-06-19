/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Edit a configuration property under a configuration group.
*/
@Generated("with GenerateAdminCommands")
class EditSTSConfigurationPropertyCmd extends AdminCmd<Void> {
    EditSTSConfigurationPropertyCmd() {
        super("editSTSConfigurationProperty")
    }

    /**
     * Name of the property.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

    /**
     * Type of the property.
     */
    def 'propertyType'(String value) {
        parameter("propertyType", value)
    }

    /**
     * Property type is null.
     */
    def 'nullPropertyType'(Boolean value) {
        parameter("nullPropertyType", value)
    }

    /**
     * New name for the property.
     */
    def 'newPropertyName'(String value) {
        parameter("newPropertyName", value)
    }

    /**
     * New type for the property.
     */
    def 'newPropertyType'(String value) {
        parameter("newPropertyType", value)
    }

    /**
     * New value for the property.
     */
    def 'newPropertyValue'(String value) {
        parameter("newPropertyValue", value)
    }

}
