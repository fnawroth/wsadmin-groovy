/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Displays a list of ports that is used by a particular server, including the node name, server name, named endpoint, and host and port values.
*/
@Generated("with GenerateAdminCommands")
class ListServerPortsCmd extends AdminCmd<Void> {
    ListServerPortsCmd() {
        super("listServerPorts")
    }

    /**
     * The name of the server node.
     */
    def 'nodeName'(java.lang.String value) {
        parameter("nodeName", value)
    }

}
