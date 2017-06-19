/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all ThreadPools that can be associated with a TCPInboundChannel or TCPOutboundChannel
*/
@Generated("with GenerateAdminCommands")
class ListTCPThreadPoolsCmd extends AdminCmd<Void> {
    ListTCPThreadPoolsCmd() {
        super("listTCPThreadPools")
    }

}
