/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the operating system platform for a given node.
*/
@Generated("with GenerateAdminCommands")
class GetNodePlatformOSCmd extends AdminCmd<Void> {
    GetNodePlatformOSCmd() {
        super("getNodePlatformOS")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
