/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get connector properties for the managed node
*/
@Generated("with GenerateAdminCommands")
class GetManagedNodeConnectorPropertiesCmd extends AdminCmd<Void> {
    GetManagedNodeConnectorPropertiesCmd() {
        super("getManagedNodeConnectorProperties")
    }

    /**
     * Connector type, such as SOAP, RMI, JSR160RMI or IPC
     */
    def 'connType'(String value) {
        parameter("connType", value)
    }

    /**
     * ManagedNode name
     */
    def 'managedNodeName'(String value) {
        parameter("managedNodeName", value)
    }

}
