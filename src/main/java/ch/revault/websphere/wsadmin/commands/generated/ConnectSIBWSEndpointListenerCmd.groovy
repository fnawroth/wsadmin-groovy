/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Connect an endpoint listener to a service integration bus.
*/
@Generated("with GenerateAdminCommands")
class ConnectSIBWSEndpointListenerCmd extends AdminCmd<Void> {
    ConnectSIBWSEndpointListenerCmd() {
        super("connectSIBWSEndpointListener")
    }

    /**
     * Name of the service integration bus to which the endpoint listener is to be connected.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Name to use for the connection's reply destination.
     */
    def 'replyDestination'(String value) {
        parameter("replyDestination", value)
    }

}
