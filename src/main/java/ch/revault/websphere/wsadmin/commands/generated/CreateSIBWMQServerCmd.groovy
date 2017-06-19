/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new WebSphere MQ server.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBWMQServerCmd extends AdminCmd<Void> {
    CreateSIBWMQServerCmd() {
        super("createSIBWMQServer")
    }

    /**
     * The name of the WebSphere MQ server. This is for administrative purposes only and can be decided by the administrator. The name is only meaningful inside WebSphere Application server administration, and must be unique at cell level.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name of the WebSphere MQ queue manager or WebSphere MQ queue sharing group represented by this WebSphere MQ server.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * Indicates whether the WebSphere MQ server represents a WebSphere MQ queue manager or a WebSphere MQ queue sharing group. It has two possible values - MQ_QUEUE_MANAGER or MQ_QUEUE_SHARING_GROUP.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * A description of the WebSphere MQ server.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * This indicates whether there exists a preference to use bindings mode when connecting to the WebSphere MQ queue manager.
     */
    def 'bindingsMode'(Boolean value) {
        parameter("bindingsMode", value)
    }

    /**
     * This is the name of the host to which a connection will be established in order to communicate with a WebSphere MQ queue manager or a WebSphere MQ queue sharing group.
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * The port monitored by a WebSphere MQ queue manager listener or WebSphere MQ queue sharing group listener, which is listening for connections.
     */
    def 'port'(Integer value) {
        parameter("port", value)
    }

    /**
     * This is the name of the server connection channel that will be used to establish a connection to the queue manager or queue sharing group. 
     */
    def 'channel'(String value) {
        parameter("channel", value)
    }

    /**
     * The authentication alias that will be supplied when connecting to the WebSphere MQ server.
     */
    def 'securityAuthAlias'(String value) {
        parameter("securityAuthAlias", value)
    }

    /**
     * The name of the transport chain to use when communicating with MQ.
     */
    def 'transportChain'(String value) {
        parameter("transportChain", value)
    }

    /**
     * Determines if user identifiers received in messages from WebSphere MQ are propagated into the WebSphere default messaging message or not.
     */
    def 'trustUserIds'(Boolean value) {
        parameter("trustUserIds", value)
    }

    /**
     * Whether automated discovery of WebSphere MQ resources should be enabled.  This parameter has two possible values: TRUE, FALSE.  The default is TRUE.
     */
    def 'allowDiscovery'(Boolean value) {
        parameter("allowDiscovery", value)
    }

    /**
     * The authentication alias to use when performing resource discovery.  
     */
    def 'discoveryAuthAlias'(String value) {
        parameter("discoveryAuthAlias", value)
    }

    /**
     * The WebSphere MQ reply-to queue used when performing resource discovery.
     */
    def 'replyToQueue'(String value) {
        parameter("replyToQueue", value)
    }

}
