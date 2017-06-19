/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* list all the nodes in the cell or on a specified nodeGroup.
*/
@Generated("with GenerateAdminCommands")
class ListNodesCmd extends AdminCmd<Void> {
    ListNodesCmd() {
        super("listNodes")
    }

    /**
     * the name of the node group
     */
    def 'nodeGroup'(String value) {
        parameter("nodeGroup", value)
    }

}
