/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Unregister a managed node from a JobManager
*/
@Generated("with GenerateAdminCommands")
class UnregisterWithJobManagerCmd extends AdminCmd<Void> {
    UnregisterWithJobManagerCmd() {
        super("unregisterWithJobManager")
    }

    /**
     * JobManager's hostname
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * JobManager administrative port number
     */
    def 'port'(String value) {
        parameter("port", value)
    }

    /**
     * Login username
     */
    def 'user'(String value) {
        parameter("user", value)
    }

    /**
     * JobManager login password
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * Name of the managed node to be unregistered
     */
    def 'managedNodeName'(String value) {
        parameter("managedNodeName", value)
    }

}
