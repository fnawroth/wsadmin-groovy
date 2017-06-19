/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add an inbound port to an inbound service.
*/
@Generated("with GenerateAdminCommands")
class AddSIBWSInboundPortCmd extends AdminCmd<Void> {
    AddSIBWSInboundPortCmd() {
        super("addSIBWSInboundPort")
    }

    /**
     * Name of the inbound port.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name of the associated endpoint listener.
     */
    def 'endpointListener'(String value) {
        parameter("endpointListener", value)
    }

    /**
     * Name of the node where the endpoint listener is located.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * Name of the server where the endpoint listener is located.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * Name of the cluster where the endpoint listener is located.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * Name of the port in the template WSDL to use as a basis for this port's binding.
     */
    def 'templatePort'(String value) {
        parameter("templatePort", value)
    }

}
