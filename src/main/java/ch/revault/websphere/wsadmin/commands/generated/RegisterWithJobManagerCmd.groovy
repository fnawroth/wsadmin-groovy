/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Register a managed node with a JobManager
*/
@Generated("with GenerateAdminCommands")
class RegisterWithJobManagerCmd extends AdminCmd<Void> {
    RegisterWithJobManagerCmd() {
        super("registerWithJobManager")
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
     * JobManager login username
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
     * Name of the managed node to be registered
     */
    def 'managedNodeName'(String value) {
        parameter("managedNodeName", value)
    }

    /**
     * Alias under which the job manager will register the managed node
     */
    def 'alias'(String value) {
        parameter("alias", value)
    }

    /**
     * Whether to start polling once registered
     */
    def 'startPolling'(Boolean value) {
        parameter("startPolling", value)
    }

    /**
     * Whether to automatically accept signer presented by server
     */
    def 'autoAcceptSigner'(Boolean value) {
        parameter("autoAcceptSigner", value)
    }

}
