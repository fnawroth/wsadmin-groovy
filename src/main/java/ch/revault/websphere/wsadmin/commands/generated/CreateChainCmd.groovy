/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new chain of transport channels based on a chain template.
*/
@Generated("with GenerateAdminCommands")
class CreateChainCmd extends AdminCmd<Void> {
    CreateChainCmd() {
        super("createChain")
    }

    /**
     * Chain template on which to base the new chain.
     */
    def 'template'(javax.management.ObjectName value) {
        parameter("template", value)
    }

    /**
     * Name of the new chain.
     */
    def 'name'(java.lang.String value) {
        parameter("name", value)
    }

    /**
     * Name of the end point to be used by the instance of the TCPInboundChannel in the new chain, if the chain is an inbound chain.
     */
    def 'endPoint'(javax.management.ObjectName value) {
        parameter("endPoint", value)
    }

}
