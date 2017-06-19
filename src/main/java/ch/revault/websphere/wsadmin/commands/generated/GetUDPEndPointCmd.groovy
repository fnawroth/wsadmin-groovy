/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the NamedEndPoint endpoint that is associated with either a UDPInboundChannel, or a chain that contains a UDPInboundChannel
*/
@Generated("with GenerateAdminCommands")
class GetUDPEndPointCmd extends AdminCmd<Void> {
    GetUDPEndPointCmd() {
        super("getUDPEndPoint")
    }

}
