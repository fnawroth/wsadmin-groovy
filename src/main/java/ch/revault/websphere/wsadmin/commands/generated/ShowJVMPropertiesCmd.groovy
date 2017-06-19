/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List Java virtual machine (JVM) configuration for the application server's process.
*/
@Generated("with GenerateAdminCommands")
class ShowJVMPropertiesCmd extends AdminCmd<Void> {
    ShowJVMPropertiesCmd() {
        super("showJVMProperties")
    }

    /**
     * The name of the Server whose process definition is modified. If there is only one server in the entire configuration, then this parameter is optional.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The name of the node. This is only needed for the server scopes that do not have a unique name across nodes.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The process type of the server.  This is for zOS only.
     */
    def 'processType'(String value) {
        parameter("processType", value)
    }

    /**
     * See command setJVMProperties for supported property names. If this parameter is not specified, then all properties are shown.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

}
