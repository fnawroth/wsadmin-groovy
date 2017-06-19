/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a IBM MQ Activation Specification at the scope provided to the command.
*/
@Generated("with GenerateAdminCommands")
class CreateWMQActivationSpecCmd extends AdminCmd<Void> {
    CreateWMQActivationSpecCmd() {
        super("createWMQActivationSpec")
    }

    /**
     * The administrative name assigned to the activation specification.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name and location used to bind this object into WebSphere Application Server JNDI.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * The JNDI name of a IBM MQ messaging provider queue or topic type destination. When an MDB is deployed with this activation specification, it is this destination that messages for the MDB will be consumed from.
     */
    def 'destinationJndiName'(String value) {
        parameter("destinationJndiName", value)
    }

    /**
     * The type of the destination specified using the destinationJndiName parameter.
     */
    def 'destinationType'(String value) {
        parameter("destinationType", value)
    }

    /**
     * An administrative description assigned to the activation specification.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * A URL to a client channel definition table to use, for this activation specification, when contacting IBM MQ. Activation specifications created using this parameter are of "ccdtURL" variety.
     */
    def 'ccdtUrl'(String value) {
        parameter("ccdtUrl", value)
    }

    /**
     * A queue manager name, used to select one or more entries from a client channel definition table.
     */
    def 'ccdtQmgrName'(String value) {
        parameter("ccdtQmgrName", value)
    }

    /**
     * The name of the queue manager to use, for this activation specification, when contacting IBM MQ. Activation specifications created using this parameter are of "user defined" variety.
     */
    def 'qmgrName'(String value) {
        parameter("qmgrName", value)
    }

    /**
     * Determines the manner in which, for this activation specification, a connection will be established to IBM MQ. Activation specifications created using this parameter are of "user defined" variety. Valid values are "BINDINGS", "BINDINGS_THEN_CLIENT" and "CLIENT".
     */
    def 'wmqTransportType'(String value) {
        parameter("wmqTransportType", value)
    }

    /**
     * The hostname which will be used, for this activation specification, when attempting a client mode connection to IBM MQ.
     */
    def 'qmgrHostname'(String value) {
        parameter("qmgrHostname", value)
    }

    /**
     * The port number to use, for this activation specification, when attempting a client mode connection to IBM MQ.
     */
    def 'qmgrPortNumber'(Integer value) {
        parameter("qmgrPortNumber", value)
    }

    /**
     * The connection name list to use, for this activation specification, when attempting a client mode connection to IBM MQ.
     */
    def 'connectionNameList'(String value) {
        parameter("connectionNameList", value)
    }

    /**
     * The authentication alias used to obtain the credentials specified when this activation specification needs to establish a connection to IBM MQ.
     */
    def 'authAlias'(String value) {
        parameter("authAlias", value)
    }

    /**
     * The client identifier used for connections started using this activation specification.
     */
    def 'clientId'(String value) {
        parameter("clientId", value)
    }

    /**
     * Determines the minimum version, and capabilities of the queue manager.
     */
    def 'providerVersion'(String value) {
        parameter("providerVersion", value)
    }

    /**
     * Specifies a list of LDAP servers which may be used to provide certificate revocation information if this activation specification establishes a SSL based connection to IBM MQ.
     */
    def 'sslCrl'(String value) {
        parameter("sslCrl", value)
    }

    /**
     * Used when the activation specification establishes an SSL connection to the queue manager. This parameter determines how many bytes to transfer before resetting the symmetric encryption key used for the SSL session.
     */
    def 'sslResetCount'(Integer value) {
        parameter("sslResetCount", value)
    }

    /**
     * Used when the activation specification establishes an SSL connection to the queue manager. This value is used to match against the distinguished name present in the peers certificate.
     */
    def 'sslPeerName'(String value) {
        parameter("sslPeerName", value)
    }

    /**
     * Determines the configuration, if any, to use when applying SSL encryption to the network connection to the queue manager.
     */
    def 'sslType'(String value) {
        parameter("sslType", value)
    }

    /**
     * Names a specific SSL configuration to use when using SSL to secure network connections to the queue manager.
     */
    def 'sslConfiguration'(String value) {
        parameter("sslConfiguration", value)
    }

    /**
     * A comma separated list of receive exit class names.
     */
    def 'rcvExit'(String value) {
        parameter("rcvExit", value)
    }

    /**
     * Initialization data to pass to the receive exit.
     */
    def 'rcvExitInitData'(String value) {
        parameter("rcvExitInitData", value)
    }

    /**
     * A comma separate list of send exit class names.
     */
    def 'sendExit'(String value) {
        parameter("sendExit", value)
    }

    /**
     * Initialization data to pass to the send exit.
     */
    def 'sendExitInitData'(String value) {
        parameter("sendExitInitData", value)
    }

    /**
     * A security exit class name.
     */
    def 'secExit'(String value) {
        parameter("secExit", value)
    }

    /**
     * Initialization data to pass to the security exit.
     */
    def 'secExitInitData'(String value) {
        parameter("secExitInitData", value)
    }

    /**
     * Determines if message headers are compressed or not.
     */
    def 'compressHeaders'(String value) {
        parameter("compressHeaders", value)
    }

    /**
     * Determines if message payloads are compressed or not.
     */
    def 'compressPayload'(String value) {
        parameter("compressPayload", value)
    }

    /**
     * Determines whether or not the connection consumer keeps unwanted messages on the input queue. A value of true means that it does. A value of false means that the messages are disposed of as per their disposition options.
     */
    def 'msgRetention'(String value) {
        parameter("msgRetention", value)
    }

    /**
     * When a message consumer in the point-to-point domain uses a message selector to select which messages it wants to receive, the IBM MQ JMS client searches the IBM MQ queue for suitable messages in the sequence determined by the MsgDeliverySequence attribute of the queue. When the client finds a suitable message and delivers it to the consumer, the client resumes the search for the next suitable message from its current position in the queue. The client continues to search the queue in this way until it reaches the end of the queue, or until the interval of time in milliseconds, as determined by the value of this property, has expired. In each case, the client returns to the beginning of the queue to continue its search, and a new time interval commences.
     */
    def 'rescanInterval'(Integer value) {
        parameter("rescanInterval", value)
    }

    /**
     * The coded-character-set-ID to be used on connections.
     */
    def 'ccsid'(Integer value) {
        parameter("ccsid", value)
    }

    /**
     * Determines the behavior of certain calls to the queue manager when the queue manager is put into quiescing state.
     */
    def 'failIfQuiescing'(Boolean value) {
        parameter("failIfQuiescing", value)
    }

    /**
     * The broker control queue to use if this activation specification is to subscribe to a topic.
     */
    def 'brokerCtrlQueue'(String value) {
        parameter("brokerCtrlQueue", value)
    }

    /**
     * The queue to use for obtaining subscription messages if this activation specification is to subscribe to a topic.
     */
    def 'brokerSubQueue'(String value) {
        parameter("brokerSubQueue", value)
    }

    /**
     * The name of the queue from which non-durable subscription messages are retrieved for a ConnectionConsumer.
     */
    def 'brokerCCSubQueue'(String value) {
        parameter("brokerCCSubQueue", value)
    }

    /**
     * Determines the level of functionality required for publish/subscribe operations.
     */
    def 'brokerVersion'(String value) {
        parameter("brokerVersion", value)
    }

    /**
     * Determines where message selection occurs.
     */
    def 'msgSelection'(String value) {
        parameter("msgSelection", value)
    }

    /**
     * Where IBM MQ JMS should store persistent data relating to active subscriptions.
     */
    def 'subStore'(String value) {
        parameter("subStore", value)
    }

    /**
     * The interval, in milliseconds, between refreshes of the long running transaction that detects when a subscriber loses its connection to the queue manager. This property is relevant only if subStore parameter has the value QUEUE.
     */
    def 'stateRefreshInt'(Integer value) {
        parameter("stateRefreshInt", value)
    }

    /**
     * Cleanup Level for BROKER or MIGRATE Subscription Stores.
     */
    def 'cleanupLevel'(String value) {
        parameter("cleanupLevel", value)
    }

    /**
     * The interval between background executions of the publish/subscribe cleanup utility.
     */
    def 'cleanupInterval'(Long value) {
        parameter("cleanupInterval", value)
    }

    /**
     * Determines which sets of characters are interpreted as topic wildcards.
     */
    def 'wildcardFormat'(String value) {
        parameter("wildcardFormat", value)
    }

    /**
     * Controls the message retrieval policy of a TopicSubscriber object.
     */
    def 'sparseSubs'(Boolean value) {
        parameter("sparseSubs", value)
    }

    /**
     * The name of the queue manager on which the broker is running.
     */
    def 'brokerQmgr'(String value) {
        parameter("brokerQmgr", value)
    }

    /**
     * Whether two or more instances of the same durable topic subscriber can run simultaneously.
     */
    def 'clonedSubs'(String value) {
        parameter("clonedSubs", value)
    }

    /**
     * The SVRCONN channel to use when connecting to IBM MQ. Specifying this property signifies that the activation specification is of the "user defined" variety.
     */
    def 'qmgrSvrconnChannel'(String value) {
        parameter("qmgrSvrconnChannel", value)
    }

    /**
     * The name of the queue from which a connection consumer receives durable subscription messages.
     */
    def 'brokerCCDurSubQueue'(String value) {
        parameter("brokerCCDurSubQueue", value)
    }

    /**
     * The maximum number of server sessions in the server session pool used by the connection consumer.
     */
    def 'maxPoolSize'(Integer value) {
        parameter("maxPoolSize", value)
    }

    /**
     * A message selector expression specifying which messages are to be delivered.
     */
    def 'messageSelector'(String value) {
        parameter("messageSelector", value)
    }

    /**
     * The period of time, in milliseconds, that an unused server session is held open in the server session pool before being closed due to inactivity.
     */
    def 'poolTimeout'(Integer value) {
        parameter("poolTimeout", value)
    }

    /**
     * Whether or not this subscription can be shared
     */
    def 'sharedSubscription'(Boolean value) {
        parameter("sharedSubscription", value)
    }

    /**
     * The period of time, in milliseconds, within which delivery of a message to an MDB must start after the work to deliver the message has been scheduled. If this period of time elapses, the message is rolled back onto the queue.
     */
    def 'startTimeout'(Integer value) {
        parameter("startTimeout", value)
    }

    /**
     * Whether a durable or nondurable subscription is used to deliver messages to an MDB subscribing to the topic.
     */
    def 'subscriptionDurability'(String value) {
        parameter("subscriptionDurability", value)
    }

    /**
     * The name of the durable subscription.
     */
    def 'subscriptionName'(String value) {
        parameter("subscriptionName", value)
    }

    /**
     * Indicates whether the endpoint should be stopped if message delivery fails the number of times specified by the failureDeliveryCount property.
     */
    def 'stopEndpointIfDeliveryFails'(Boolean value) {
        parameter("stopEndpointIfDeliveryFails", value)
    }

    /**
     * The number of sequential delivery failures that are allowed before the endpoint is suspended.
     */
    def 'failureDeliveryCount'(Integer value) {
        parameter("failureDeliveryCount", value)
    }

    /**
     * This property specifies either or both of the following: a) The local network interface to be used b) The local port, or range of local ports, to be used.
     */
    def 'localAddress'(String value) {
        parameter("localAddress", value)
    }

}
