/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the port associated with the specified bridge interface.  This is the port specified on the TCP inbound channel of transport channel chain for the specified bridge interface.
*/
@Generated("with GenerateAdminCommands")
class GetNamedTCPEndPointCmd extends AdminCmd<Void> {
    GetNamedTCPEndPointCmd() {
        super("getNamedTCPEndPoint")
    }

    /**
     * Bridge interface object for which the port will be listed.
     */
    def 'bridgeInterface'(String value) {
        parameter("bridgeInterface", value)
    }

}
