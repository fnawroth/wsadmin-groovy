/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new NamedEndPoint that can be associated with a TCPInboundChannel
*/
@Generated("with GenerateAdminCommands")
class CreateTCPEndPointCmd extends AdminCmd<Void> {
    CreateTCPEndPointCmd() {
        super("createTCPEndPoint")
    }

    /**
     * Name for the new NamedEndPoint
     */
    def 'name'(java.lang.String value) {
        parameter("name", value)
    }

    /**
     * Host for the new NamedEndPoint
     */
    def 'host'(java.lang.String value) {
        parameter("host", value)
    }

    /**
     * Port for the new NamedEndPoint
     */
    def 'port'(java.lang.Integer value) {
        parameter("port", value)
    }

}
