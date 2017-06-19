/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Disconnect an endpoint listener from a service integration bus.
*/
@Generated("with GenerateAdminCommands")
class DisconnectSIBWSEndpointListenerCmd extends AdminCmd<Void> {
    DisconnectSIBWSEndpointListenerCmd() {
        super("disconnectSIBWSEndpointListener")
    }

    /**
     * Name of the service integration bus from which the endpoint listener is to be disconnected.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
