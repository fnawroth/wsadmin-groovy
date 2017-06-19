/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Provides the ability to manage the settings associated with the IBM MQ resource adapter installed at a particular scope.
*/
@Generated("with GenerateAdminCommands")
class ManageWMQCmd extends AdminCmd<Void> {
    ManageWMQCmd() {
        super("manageWMQ")
    }

    /**
     * Specifies the path to the IBM MQ messaging provider native libraries to be used if the IBM MQ resource adapter is to establish a bindings mode connection to the queue manager.
     */
    def 'nativePath'(String value) {
        parameter("nativePath", value)
    }

    /**
     * Provides information about the IBM MQ messaging provider.  This can be the IBM MQ resource adapter installed into WebSphere Application Server, or a IBM MQ resource adapter present on the filesystem of the node.
     */
    def 'query'(String value) {
        parameter("query", value)
    }

    /**
     * Enables inbound JCA message delivery for the z/OS platform.
     */
    def 'enableInbound'(Boolean value) {
        parameter("enableInbound", value)
    }

    /**
     * Disables all IBM MQ functionality on servers at the specified scope and lower. In a single server environment this disables IBM MQ functionality on the entire server.
     */
    def 'disableWMQ'(Boolean value) {
        parameter("disableWMQ", value)
    }

    /**
     * The maximum number of connections to a IBM MQ queue manager.
     */
    def 'maxConnections'(Integer value) {
        parameter("maxConnections", value)
    }

    /**
     * The maximum number of message-driven beans that can be supplied by each connection.
     */
    def 'connectionConcurrency'(Integer value) {
        parameter("connectionConcurrency", value)
    }

    /**
     * The maximum number of attempts made by a IBM MQ messaging provider activation specification to reconnect to a IBM MQ queue manager if a connection fails.
     */
    def 'reconnectionRetryCount'(Integer value) {
        parameter("reconnectionRetryCount", value)
    }

    /**
     * The time, in milliseconds, that a IBM MQ messaging provider activation specification waits before making another attempt to reconnect to a IBM MQ queue manager.
     */
    def 'reconnectionRetryInterval'(Integer value) {
        parameter("reconnectionRetryInterval", value)
    }

}
