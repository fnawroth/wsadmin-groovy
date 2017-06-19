/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command list all the property values defined on a resource provider such as JDBCProvider or a connection factory such as DataSource or JMSConnectionFactory.
*/
@Generated("with GenerateAdminCommands")
class ShowResourcePropertiesCmd extends AdminCmd<Void> {
    ShowResourcePropertiesCmd() {
        super("showResourceProperties")
    }

    /**
     * The name of a property. If the property name is specified, then the value of the specified property name is returned. If the property name is not specified, then all the property values are shown in a format of list where each element in the list is a property name value pair.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

}
