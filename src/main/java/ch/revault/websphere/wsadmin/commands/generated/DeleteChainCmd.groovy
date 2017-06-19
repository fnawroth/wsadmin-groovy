/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing chain and, optionally, the transport channels in the chain.
*/
@Generated("with GenerateAdminCommands")
class DeleteChainCmd extends AdminCmd<Void> {
    DeleteChainCmd() {
        super("deleteChain")
    }

    /**
     * If specified, non-shared transport channels used by the specified chain will also be deleted.
     */
    def 'deleteChannels'(java.lang.Boolean value) {
        parameter("deleteChannels", value)
    }

}
