/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all chains configured under a particular instance of TransportChannelService.
*/
@Generated("with GenerateAdminCommands")
class ListChainsCmd extends AdminCmd<Void> {
    ListChainsCmd() {
        super("listChains")
    }

    /**
     * Chains returned by this method should all have a transport channel instance of the specified type as the last transport channel in the chain.
     */
    def 'acceptorFilter'(java.lang.String value) {
        parameter("acceptorFilter", value)
    }

    /**
     * Chains returned by this method should all have a TCPInboundChannel using an end point with the specified name.
     */
    def 'endPointFilter'(java.lang.String value) {
        parameter("endPointFilter", value)
    }

}
