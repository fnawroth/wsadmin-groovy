/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes the specified chain from the list of permitted chains for the specified bus.
*/
@Generated("with GenerateAdminCommands")
class RemoveSIBPermittedChainCmd extends AdminCmd<Void> {
    RemoveSIBPermittedChainCmd() {
        super("removeSIBPermittedChain")
    }

    /**
     * The name of the bus to remove the permitted chain from.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the permitted transport chain to remove.
     */
    def 'chain'(String value) {
        parameter("chain", value)
    }

}
