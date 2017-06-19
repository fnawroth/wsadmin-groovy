/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a IBM MQ Connection Factory at the scope provided to the command.
*/
@Generated("with GenerateAdminCommands")
class CreateWMQConnectionFactoryCmd extends AdminCmd<Void> {
    CreateWMQConnectionFactoryCmd() {
        super("createWMQConnectionFactory")
    }

    /**
     * The type of IBM MQ Connection Factory to list. Valid values are "CF", "QCF", and "TCF".
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * The administrative name to assign to the connection factory.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name used to bind this connection factory into WebSphere Application Server JNDI.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * An administrative description assigned to the connection factory.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * A URL to a client channel definition table to use, for this connection factory, when contacting IBM MQ. Connection factories created using this parameter are of "ccdtURL" variety.
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
     * The name of the queue manager to use, for this connection factory, when contacting IBM MQ. Connection factories created using this parameter are of "user defined" variety.
     */
    def 'qmgrName'(String value) {
        parameter("qmgrName", value)
    }

    /**
     * Determines the manner in which, for this connection factory, a connection will be established to IBM MQ. Connection factories created using this parameter are of "user defined" variety. Valid values are "BINDINGS", "BINDINGS_THEN_CLIENT" and "CLIENT".
     */
    def 'wmqTransportType'(String value) {
        parameter("wmqTransportType", value)
    }

    /**
     * The hostname which will be used, for this connection factory, when attempting a client mode connection to IBM MQ.
     */
    def 'qmgrHostname'(String value) {
        parameter("qmgrHostname", value)
    }

    /**
     * The port number to use, for this connection factory, when attempting a client mode connection to IBM MQ.
     */
    def 'qmgrPortNumber'(Integer value) {
        parameter("qmgrPortNumber", value)
    }

    /**
     * The connection name list to use, for this connection factory, when attempting a client mode connection to IBM MQ. This parameter is not valid for connection factories with a transport type of bindings. 
     */
    def 'connectionNameList'(String value) {
        parameter("connectionNameList", value)
    }

    /**
     * Specifies a component managed authentication alias, from which security credentials are to be used when establishing a connection to IBM MQ.
     */
    def 'componentAuthAlias'(String value) {
        parameter("componentAuthAlias", value)
    }

    /**
     * Specifies a container managed authentication alias, from which security credentials are to be used when establishing a connection to IBM MQ.
     */
    def 'containerAuthAlias'(String value) {
        parameter("containerAuthAlias", value)
    }

    /**
     * Specifies the JAAS mapping alias to use when determining the security related credentials to use when establishing a connection to IBM MQ.
     */
    def 'mappingAlias'(String value) {
        parameter("mappingAlias", value)
    }

    /**
     * The authentication alias from which the credentials used to connect to IBM MQ for the purposes of XA recovery are taken.
     */
    def 'xaRecoveryAuthAlias'(String value) {
        parameter("xaRecoveryAuthAlias", value)
    }

    /**
     * The client identifier used for connections started using this connection factory.
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
     * Specifies a list of LDAP servers which may be used to provide certificate revocation information if this connection factory establishes a SSL based connection to IBM MQ.
     */
    def 'sslCrl'(String value) {
        parameter("sslCrl", value)
    }

    /**
     * Used when the connection factory establishes an SSL connection to the queue manager. This parameter determines how many bytes to transfer before resetting the symmetric encryption key used for the SSL session.
     */
    def 'sslResetCount'(Integer value) {
        parameter("sslResetCount", value)
    }

    /**
     * Used when the connection factory establishes an SSL connection to the queue manager. This value is used to match against the distinguished name present in the peers certificate.
     */
    def 'sslPeerName'(String value) {
        parameter("sslPeerName", value)
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
     * A comma separated list of security exit class names.
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
     * Determines whether or not the connection consumer keeps unwanted messages on the input queue. A value of true means that it does. A value of false means that the messages are disposed of as per their disposition options. This parameter is only valid for queue connection factories.
     */
    def 'msgRetention'(String value) {
        parameter("msgRetention", value)
    }

    /**
     * If each message listener within a session has no suitable message on its queue, this is the maximum interval, in milliseconds, that elapses before each message listener tries again to get a message from its queue. If it frequently happens that no suitable message is available for any of the message listeners in a session, consider increasing the value of this property. This is only applicable in the client container.
     */
    def 'pollingInterval'(Integer value) {
        parameter("pollingInterval", value)
    }

    /**
     * When a message consumer in the point-to-point domain uses a message selector to select which messages it wants to receive, the IBM MQ JMS client searches the IBM MQ queue for suitable messages in the sequence determined by the MsgDeliverySequence attribute of the queue. When the client finds a suitable message and delivers it to the consumer, the client resumes the search for the next suitable message from its current position in the queue. The client continues to search the queue in this way until it reaches the end of the queue, or until the interval of time in milliseconds, as determined by the value of this property, has expired. In each case, the client returns to the beginning of the queue to continue its search, and a new time interval commences. This parameter is only valid for queue connection factories.
     */
    def 'rescanInterval'(Integer value) {
        parameter("rescanInterval", value)
    }

    /**
     * The coded-character-set-ID to be used on connections.
     */
    def 'ccsid'(String value) {
        parameter("ccsid", value)
    }

    /**
     * Determines the behavior of certain calls to the queue manager when the queue manager is put into quiescing state.
     */
    def 'failIfQuiescing'(Boolean value) {
        parameter("failIfQuiescing", value)
    }

    /**
     * The broker control queue to use if this connection factory is to subscribe to a topic. This parameter is only valid for topic connection factories.
     */
    def 'brokerCtrlQueue'(String value) {
        parameter("brokerCtrlQueue", value)
    }

    /**
     * The queue to use for obtaining subscription messages if this connection factory is to subscribe to a topic. This parameter is only valid for topic connection factories.
     */
    def 'brokerSubQueue'(String value) {
        parameter("brokerSubQueue", value)
    }

    /**
     * The name of the queue from which non-durable subscription messages are retrieved for a ConnectionConsumer. This parameter is only valid for topic connection factories.
     */
    def 'brokerCCSubQueue'(String value) {
        parameter("brokerCCSubQueue", value)
    }

    /**
     * Determines the level of functionality required for publish/subscribe operations. This parameter is only valid for topic connection factories.
     */
    def 'brokerVersion'(String value) {
        parameter("brokerVersion", value)
    }

    /**
     * Determines where message selection occurs. This parameter is only valid for topic connection factories.
     */
    def 'msgSelection'(String value) {
        parameter("msgSelection", value)
    }

    /**
     * Where IBM MQ JMS should store persistent data relating to active subscriptions. This parameter is only valid for topic connection factories.
     */
    def 'subStore'(String value) {
        parameter("subStore", value)
    }

    /**
     * The interval, in milliseconds, between refreshes of the long running transaction that detects when a subscriber loses its connection to the queue manager. This property is relevant only if subStore parameter has the value QUEUE. This parameter is only valid for topic connection factories.
     */
    def 'stateRefreshInt'(Integer value) {
        parameter("stateRefreshInt", value)
    }

    /**
     * Cleanup Level for BROKER or MIGRATE Subscription Stores. This parameter is only valid for topic connection factories.
     */
    def 'cleanupLevel'(String value) {
        parameter("cleanupLevel", value)
    }

    /**
     * The interval between background executions of the publish/subscribe cleanup utility. This parameter is only valid for topic connection factories.
     */
    def 'cleanupInterval'(Long value) {
        parameter("cleanupInterval", value)
    }

    /**
     * Determines which sets of characters are interpreted as topic wildcards. This parameter is only valid for topic connection factories.
     */
    def 'wildcardFormat'(String value) {
        parameter("wildcardFormat", value)
    }

    /**
     * Controls the message retrieval policy of a TopicSubscriber object. This parameter is only valid for topic connection factories.
     */
    def 'sparseSubs'(Boolean value) {
        parameter("sparseSubs", value)
    }

    /**
     * The name of the queue manager on which the broker is running. This parameter is only valid for topic connection factories.
     */
    def 'brokerQmgr'(String value) {
        parameter("brokerQmgr", value)
    }

    /**
     * Whether two or more instances of the same durable topic subscriber can run simultaneously. This parameter is only valid for topic connection factories.
     */
    def 'clonedSubs'(String value) {
        parameter("clonedSubs", value)
    }

    /**
     * This property specifies either or both of the following: a) The local network interface to be used b) The local port, or range of local ports, to be used.
     */
    def 'localAddress'(String value) {
        parameter("localAddress", value)
    }

    /**
     * The SVRCONN channel to use when connecting to IBM MQ. Specifying this property signifies that the connection factory is of the "user defined" variety.
     */
    def 'qmgrSvrconnChannel'(String value) {
        parameter("qmgrSvrconnChannel", value)
    }

    /**
     * Determines if the connection factory will act as a resource which is capable of participation in distributed two phase commit processing.
     */
    def 'support2PCProtocol'(Boolean value) {
        parameter("support2PCProtocol", value)
    }

    /**
     * The IBM MQ model queue definition to use as a basis when creating JMS temporary destinations. This parameter is only valid for queue connection factories.
     */
    def 'modelQueue'(String value) {
        parameter("modelQueue", value)
    }

    /**
     * The prefix to apply to IBM MQ temporary queues used to represent JMS temporary queue type destinations. This parameter is only valid for queue connection factories.
     */
    def 'tempQueuePrefix'(String value) {
        parameter("tempQueuePrefix", value)
    }

    /**
     * The prefix to apply to IBM MQ temporary topics names that are used to represent JMS temporary topic type destinations. This parameter is only valid for topic connection factories.
     */
    def 'tempTopicPrefix'(String value) {
        parameter("tempTopicPrefix", value)
    }

    /**
     * Determines whether, when replying to a message, a RFH version 2 header is included in the reply message. This parameter is only valid for queue connection factories.
     */
    def 'replyWithRFH2'(String value) {
        parameter("replyWithRFH2", value)
    }

    /**
     * The queue to send publication messages to when using queue based brokering. This parameter is only valid for topic connection factories.
     */
    def 'brokerPubQueue'(String value) {
        parameter("brokerPubQueue", value)
    }

    /**
     * The number of publications to send to a queue based broker before sending a publication which solicits an acknowledgement. This parameter is only valid for topic connection factories.
     */
    def 'pubAckInterval'(Integer value) {
        parameter("pubAckInterval", value)
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
     * The maximum number of messages to be taken from a queue in one packet when using asynchronous message delivery.
     */
    def 'maxBatchSize'(Integer value) {
        parameter("maxBatchSize", value)
    }

    /**
     * Specifies whether a client mode connection reconnects automatically or not in the event of a communications or queue manager failure. This parameter is ignored unless the connection factory is being used in a thin or managed client environment. Legal values are "ASDEF", "QMGR", "RECONNECT" and "DISABLED".
     */
    def 'clientReconnectOptions'(String value) {
        parameter("clientReconnectOptions", value)
    }

    /**
     * The maximum amount of time, in seconds, that a client mode connection will spend attempting to automatically reconnect to a queue manager after a communications or queue manager failure. This parameter is ignored unless the connection factory is being used in a thin or managed client environment. Whether this parameter is used or not depends on the value of the client reconnect options parameter. 
     */
    def 'clientReconnectTimeout'(Integer value) {
        parameter("clientReconnectTimeout", value)
    }

}
