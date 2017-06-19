/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the NamedEndPoint associated with either a TCPInboundChannel, or a chain that contains a TCPInboundChannel
*/
@Generated("with GenerateAdminCommands")
class GetTCPEndPointCmd extends AdminCmd<Void> {
    GetTCPEndPointCmd() {
        super("getTCPEndPoint")
    }

}
