/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Determines whether or not a given node is a z/OS node. Returns "true" if node operating system is Z/OS, "false" otherwise. 
*/
@Generated("with GenerateAdminCommands")
class IsNodeZOSCmd extends AdminCmd<Void> {
    IsNodeZOSCmd() {
        super("isNodeZOS")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
