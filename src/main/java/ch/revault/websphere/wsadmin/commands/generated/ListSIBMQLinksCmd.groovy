/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the WebSphere MQ links.
*/
@Generated("with GenerateAdminCommands")
class ListSIBMQLinksCmd extends AdminCmd<Void> {
    ListSIBMQLinksCmd() {
        super("listSIBMQLinks")
    }

    /**
     * The name of the bus.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the node.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * The name of the server.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * The name of the cluster.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * The name of the messaging engine.
     */
    def 'messagingEngine'(String value) {
        parameter("messagingEngine", value)
    }

    /**
     * The name of the foreign bus.
     */
    def 'foreignBus'(String value) {
        parameter("foreignBus", value)
    }

    /**
     * The output from the command is a format suitable for java program clients.
     */
    def 'javaFormat'(Boolean value) {
        parameter("javaFormat", value)
    }

}
