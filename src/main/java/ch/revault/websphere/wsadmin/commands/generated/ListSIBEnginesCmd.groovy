/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List messaging engines.
*/
@Generated("with GenerateAdminCommands")
class ListSIBEnginesCmd extends AdminCmd<Void> {
    ListSIBEnginesCmd() {
        super("listSIBEngines")
    }

    /**
     * The bus whose engines are to be listed.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * To list messaging engines on a server, supply node and server name, but not cluster name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To list messaging engines on a server, supply node and server name, but not cluster name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To list messaging engines on a cluster, supply cluster name, but not node and server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

}
