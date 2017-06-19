/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete the default engine or named engine from the target bus.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBEngineCmd extends AdminCmd<Void> {
    DeleteSIBEngineCmd() {
        super("deleteSIBEngine")
    }

    /**
     * The name of the bus to which the messaging engine to be deleted belongs.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * To delete a messaging engine on a server, supply node and server name, but not cluster name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To delete a messaging engine on a server, supply node and server name, but not cluster name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To delete a messaging engine on a cluster, supply cluster name, but not node and server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * The name of the messaging engine to delete. This is optional, and is only required when deleting a messaging engine from a cluster.
     */
    def 'engine'(String value) {
        parameter("engine", value)
    }

}
