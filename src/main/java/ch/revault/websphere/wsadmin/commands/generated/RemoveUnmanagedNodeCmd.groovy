/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use this command to remove an unmanaged node from a cell.
*/
@Generated("with GenerateAdminCommands")
class RemoveUnmanagedNodeCmd extends AdminCmd<Void> {
    RemoveUnmanagedNodeCmd() {
        super("removeUnmanagedNode")
    }

    /**
     * Name of unmanaged node to be removed from the cell.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
