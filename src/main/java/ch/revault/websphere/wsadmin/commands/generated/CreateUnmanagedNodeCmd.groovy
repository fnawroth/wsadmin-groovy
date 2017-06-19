/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use this command to create an unmanaged node in a cell.
*/
@Generated("with GenerateAdminCommands")
class CreateUnmanagedNodeCmd extends AdminCmd<Void> {
    CreateUnmanagedNodeCmd() {
        super("createUnmanagedNode")
    }

    /**
     * Name of unmanaged node to be created in the cell.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * hostname of unmanaged node.
     */
    def 'hostName'(String value) {
        parameter("hostName", value)
    }

    /**
     * Unmanaged node's platform type must be one of:
 os400, aix, hpux, linux, solaris, windows, os390
     */
    def 'nodeOperatingSystem'(String value) {
        parameter("nodeOperatingSystem", value)
    }

}
