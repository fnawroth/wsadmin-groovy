/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show a messaging engine's attributes.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBEngineCmd extends AdminCmd<Void> {
    ShowSIBEngineCmd() {
        super("showSIBEngine")
    }

    /**
     * The name of the bus to which the messaging engine to be shown belongs.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * To show a messaging engine that belongs to a server, supply node and server name, but not cluster name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To show a messaging engine that belongs to a server, supply node and server name, but not cluster name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To show a messaging engine that belongs to a cluster, supply cluster name, but not node and server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * The name of the engine to show.
     */
    def 'engine'(String value) {
        parameter("engine", value)
    }

}
