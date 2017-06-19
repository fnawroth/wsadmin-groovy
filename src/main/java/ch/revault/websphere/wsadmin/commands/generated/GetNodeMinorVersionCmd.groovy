/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the minor version for a node, for example, "0.0.0" for v6.0.0.0.
*/
@Generated("with GenerateAdminCommands")
class GetNodeMinorVersionCmd extends AdminCmd<Void> {
    GetNodeMinorVersionCmd() {
        super("getNodeMinorVersion")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
