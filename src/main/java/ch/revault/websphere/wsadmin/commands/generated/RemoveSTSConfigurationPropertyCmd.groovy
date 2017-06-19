/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove a configuration property under a configuration group.
*/
@Generated("with GenerateAdminCommands")
class RemoveSTSConfigurationPropertyCmd extends AdminCmd<Void> {
    RemoveSTSConfigurationPropertyCmd() {
        super("removeSTSConfigurationProperty")
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

}
