/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new NamedEndPoint endpoint to associate with a UDPInboundChannel
*/
@Generated("with GenerateAdminCommands")
class CreateUDPEndPointCmd extends AdminCmd<Void> {
    CreateUDPEndPointCmd() {
        super("createUDPEndPoint")
    }

    /**
     * Name for the new NamedEndPoint endpoint
     */
    def 'name'(java.lang.String value) {
        parameter("name", value)
    }

    /**
     * Host for the new NamedEndPoint endpoint
     */
    def 'host'(java.lang.String value) {
        parameter("host", value)
    }

    /**
     * Port for the new NamedEndPoint endpoint
     */
    def 'port'(java.lang.Integer value) {
        parameter("port", value)
    }

}
