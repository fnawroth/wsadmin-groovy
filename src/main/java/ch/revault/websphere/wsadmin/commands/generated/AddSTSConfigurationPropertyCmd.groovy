/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add a configuration property under a configuration group.
*/
@Generated("with GenerateAdminCommands")
class AddSTSConfigurationPropertyCmd extends AdminCmd<Void> {
    AddSTSConfigurationPropertyCmd() {
        super("addSTSConfigurationProperty")
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
