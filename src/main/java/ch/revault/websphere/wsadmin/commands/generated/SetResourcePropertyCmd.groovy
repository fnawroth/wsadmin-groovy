/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command sets the value of a specified property defined on a resource provider such as JDBCProvider or a connection factory such as DataSource or JMSConnectionFactory. If the property with specified key is defined already, then this command overrides the value. If none property with specified key is defined yet, then this command will add the property with specified key and value.
*/
@Generated("with GenerateAdminCommands")
class SetResourcePropertyCmd extends AdminCmd<Void> {
    SetResourcePropertyCmd() {
        super("setResourceProperty")
    }

    /**
     * The name of a property.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

    /**
     * The value of a property.
     */
    def 'propertyValue'(String value) {
        parameter("propertyValue", value)
    }

    /**
     * Type of the property.
     */
    def 'propertyType'(String value) {
        parameter("propertyType", value)
    }

    /**
     * The description of the property
     */
    def 'propertyDescription'(String value) {
        parameter("propertyDescription", value)
    }

}
