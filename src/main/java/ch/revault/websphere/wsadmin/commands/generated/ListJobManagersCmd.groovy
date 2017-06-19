/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all JobManagers which a given managed node is registered with
*/
@Generated("with GenerateAdminCommands")
class ListJobManagersCmd extends AdminCmd<Void> {
    ListJobManagersCmd() {
        super("listJobManagers")
    }

    /**
     * Name of the managed node by which JobManagers are looked up
     */
    def 'managedNodeName'(String value) {
        parameter("managedNodeName", value)
    }

    /**
     * ID of a specific JobManager (optional)
     */
    def 'jobManagerUUID'(String value) {
        parameter("jobManagerUUID", value)
    }

    /**
     * The host component of JobManager URL
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * The port component of JobManager URL
     */
    def 'port'(String value) {
        parameter("port", value)
    }

}
