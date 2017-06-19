/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create bus destinations.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBDestinationsCmd extends AdminCmd<Void> {
    CreateSIBDestinationsCmd() {
        super("createSIBDestinations")
    }

    /**
     * Name of the bus where this destination is to be configured.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Destination type (Alias | Foreign | Port | Queue | TopicSpace | WebService).
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * To assign the destination to a cluster, supply cluster name, but not node and server name or WebSphere MQ server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * To assign the destination to a server, supply node name server name, but not cluster name or WebSphere MQ server name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To assign the destination to a server, supply node name server name, but not cluster name or WebSphere MQ server name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To assign the destination to a WebSphere MQ server, supply a WebSphere MQ server name, but not node, server name or cluster name.
     */
    def 'wmqServer'(String value) {
        parameter("wmqServer", value)
    }

    /**
     * If this is an alias destination, the source bus name of alias mapping.
     */
    def 'aliasBus'(String value) {
        parameter("aliasBus", value)
    }

    /**
     * If this is an alias destination, the name of the bus that the destination it maps to is configured on.
     */
    def 'targetBus'(String value) {
        parameter("targetBus", value)
    }

    /**
     * If this is an alias destination, the name of the destination it maps to.
     */
    def 'targetName'(String value) {
        parameter("targetName", value)
    }

    /**
     * If this is a foreign destination, the name of the foreign bus.
     */
    def 'foreignBus'(String value) {
        parameter("foreignBus", value)
    }

    /**
     * Description.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The quality of service for message flows through this destination, from BEST_EFFORT_NON-PERSISTENT to ASSURED_PERSISTENT, in order of increasing reliability. Higher levels of reliability have higher impacts on the performance.
     */
    def 'reliability'(String value) {
        parameter("reliability", value)
    }

    /**
     * The maximum reliability quality of service that is accepted for values specified by producers.
     */
    def 'maxReliability'(String value) {
        parameter("maxReliability", value)
    }

    /**
     * The quality of service used for inbound messages which WebSphere MQ regards as being non-persistent.  Allowable values are { BEST_EFFORT_NONPERSISTENT | EXPRESS_NONPERSISTENT | RELIABLE_NONPERSISTENT | RELIABLE_PERSISTENT | ASSURED_PERSISTENT }.
     */
    def 'nonPersistentReliability'(String value) {
        parameter("nonPersistentReliability", value)
    }

    /**
     * The quality of service used for inbound messages which WebSphere MQ regards as being persistent.  Allowable values are { BEST_EFFORT_NONPERSISTENT | EXPRESS_NONPERSISTENT | RELIABLE_NONPERSISTENT | RELIABLE_PERSISTENT | ASSURED_PERSISTENT }.
     */
    def 'persistentReliability'(String value) {
        parameter("persistentReliability", value)
    }

    /**
     * Controls the quality of service for message flows between producers and the destination. Select this option to use the quality of service specified by producers instead of the quality defined for the destination.
     */
    def 'overrideOfQOSByProducerAllowed'(String value) {
        parameter("overrideOfQOSByProducerAllowed", value)
    }

    /**
     * The default priority for message flows through this destination, in the range 0 (lowest) through 9 (highest). This default priority is used for messages that do not contain a priority value.
     */
    def 'defaultPriority'(Integer value) {
        parameter("defaultPriority", value)
    }

    /**
     * The maximum number of times that service tries to deliver a message to the destination before forwarding it to the exception destination.
     */
    def 'maxFailedDeliveries'(Integer value) {
        parameter("maxFailedDeliveries", value)
    }

    /**
     * The name of another destination to which the system sends a message that cannot be delivered to this destination within the specified maximum number of failed deliveries.
     */
    def 'exceptionDestination'(String value) {
        parameter("exceptionDestination", value)
    }

    /**
     * The reliability level at or below which messages that are subject to exception processing will be discarded. Messages above this reliability threshold are handled by the specified exception destination. Allowable values are { BEST_EFFORT_NONPERSISTENT | EXPRESS_NONPERSISTENT | RELIABLE_NONPERSISTENT | RELIABLE_PERSISTENT | ASSURED_PERSISTENT }.
     */
    def 'exceptionDiscardReliability'(String value) {
        parameter("exceptionDiscardReliability", value)
    }

    /**
     * Clear this option (setting it to false) to stop producers from being able to send messages to this destination.
     */
    def 'sendAllowed'(String value) {
        parameter("sendAllowed", value)
    }

    /**
     * Clear this option (setting it to false) to prevent consumers from being able to receive messages from this destination.
     */
    def 'receiveAllowed'(String value) {
        parameter("receiveAllowed", value)
    }

    /**
     * Select this option (setting it to true) to allow only one consumer to attach to a destination.
     */
    def 'receiveExclusive'(Boolean value) {
        parameter("receiveExclusive", value)
    }

    /**
     * Select this option (setting it to true) to enforce message order for this destination.
     */
    def 'maintainStrictMessageOrder'(Boolean value) {
        parameter("maintainStrictMessageOrder", value)
    }

    /**
     * Topic access check required.
     */
    def 'topicAccessCheckRequired'(Boolean value) {
        parameter("topicAccessCheckRequired", value)
    }

    /**
     * The name of the destination for reply messages.
     */
    def 'replyDestination'(String value) {
        parameter("replyDestination", value)
    }

    /**
     * The name of the bus on which the reply destination is configured.
     */
    def 'replyDestinationBus'(String value) {
        parameter("replyDestinationBus", value)
    }

    /**
     * Indicates whether the authorization check should be delegated to the alias or target destination.
     */
    def 'delegateAuthorizationCheckToTarget'(Boolean value) {
        parameter("delegateAuthorizationCheckToTarget", value)
    }

    /**
     * The name of the WebSphere MQ queue for messages.  This must be specified with the WebSphere MQ server name, but not node, server name or cluster name.
     */
    def 'wmqQueueName'(String value) {
        parameter("wmqQueueName", value)
    }

    /**
     * Determines if messages sent to the WebSphere MQ destination have an RFH2 header or not.  This must be specified with the WebSphere MQ server name, but not node, server name or cluster name.
     */
    def 'useRFH2'(Boolean value) {
        parameter("useRFH2", value)
    }

    /**
     * Used to allow or prevent the bus from auditing topic level authorization checks when the bus and application server have auditing enabled.
     */
    def 'auditAllowed'(Boolean value) {
        parameter("auditAllowed", value)
    }

    /**
     * Override the blocked destination retry interval configured on the messaging engine owning the destination.
     */
    def 'blockedRetryTimeout'(java.lang.Long value) {
        parameter("blockedRetryTimeout", value)
    }

    /**
     * If selected, messages sent to WebSphere MQ will include an RFH2 header. The RFH2 header stores additional information to that which is stored in the WebSphere  MQ message header.
     */
    def 'mqRfh2Allowed'(Boolean value) {
        parameter("mqRfh2Allowed", value)
    }

    /**
     * Set this option (Setting it to true) to persist the redelivery count of JMS messages into the Messagestore.
     */
    def 'persistRedeliveryCount'(Boolean value) {
        parameter("persistRedeliveryCount", value)
    }

}
