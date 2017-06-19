/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds the specified chain to the list of permitted chains for the specified bus.
*/
@Generated("with GenerateAdminCommands")
class AddSIBPermittedChainCmd extends AdminCmd<Void> {
    AddSIBPermittedChainCmd() {
        super("addSIBPermittedChain")
    }

    /**
     * The name of the bus to add the permitted chain to.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the permitted transport chain to add.
     */
    def 'chain'(String value) {
        parameter("chain", value)
    }

}
