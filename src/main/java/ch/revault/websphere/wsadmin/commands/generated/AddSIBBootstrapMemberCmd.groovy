/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Nominates a server or cluster for use as a bootstrap server.
*/
@Generated("with GenerateAdminCommands")
class AddSIBBootstrapMemberCmd extends AdminCmd<Void> {
    AddSIBBootstrapMemberCmd() {
        super("addSIBBootstrapMember")
    }

    /**
     * Name of the bus to add the server or cluster to the list of nominated servers.
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
     * The name of a server to be nominated for bootstrap.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * The name of a cluster that should be nominated for bootstrap.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

}
