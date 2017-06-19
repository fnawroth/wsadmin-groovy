/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a nominated bootstrap server or cluster from the list of nominated bootstrap members for the bus.
*/
@Generated("with GenerateAdminCommands")
class RemoveSIBBootstrapMemberCmd extends AdminCmd<Void> {
    RemoveSIBBootstrapMemberCmd() {
        super("removeSIBBootstrapMember")
    }

    /**
     * Name of the bus to remove the server or cluster bootstrap server from.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the node the server to be selected is defined to.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * The name of the server to remove from the list of nominated bootstrap servers.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * The name of the cluster to remove from the list of nominated bootstrap servers.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

}
