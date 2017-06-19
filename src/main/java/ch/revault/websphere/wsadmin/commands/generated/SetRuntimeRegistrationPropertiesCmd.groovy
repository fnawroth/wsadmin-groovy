/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set certain runtime properties for devices and job managers. Caution: a null ID implies each and everyone
*/
@Generated("with GenerateAdminCommands")
class SetRuntimeRegistrationPropertiesCmd extends AdminCmd<Void> {
    SetRuntimeRegistrationPropertiesCmd() {
        super("setRuntimeRegistrationProperties")
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

    /**
     * Interval by which the managed node polls the job manager (in seconds)
     */
    def 'interval'(String value) {
        parameter("interval", value)
    }

    /**
     * Maximum size of node thread pool
     */
    def 'size'(String value) {
        parameter("size", value)
    }

}
