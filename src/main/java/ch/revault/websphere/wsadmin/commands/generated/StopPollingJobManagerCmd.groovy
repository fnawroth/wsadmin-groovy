/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Stop a managed node's polling against a JobManager
*/
@Generated("with GenerateAdminCommands")
class StopPollingJobManagerCmd extends AdminCmd<Void> {
    StopPollingJobManagerCmd() {
        super("stopPollingJobManager")
    }

    /**
     * Name of the managed node that polls
     */
    def 'managedNodeName'(String value) {
        parameter("managedNodeName", value)
    }

    /**
     * ID of the JobManager being polled by the managed node
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
