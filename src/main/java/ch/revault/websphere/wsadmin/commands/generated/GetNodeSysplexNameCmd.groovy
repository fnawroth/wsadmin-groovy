/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the operating system platform for a given node.  This valueapplies only to nodes running on the z/OS operating system.
*/
@Generated("with GenerateAdminCommands")
class GetNodeSysplexNameCmd extends AdminCmd<Void> {
    GetNodeSysplexNameCmd() {
        super("getNodeSysplexName")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
