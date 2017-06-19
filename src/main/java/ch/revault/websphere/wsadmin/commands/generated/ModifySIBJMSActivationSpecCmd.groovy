/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify the attributes of the given SIB JMS activation specification.
*/
@Generated("with GenerateAdminCommands")
class ModifySIBJMSActivationSpecCmd extends AdminCmd<Void> {
    ModifySIBJMSActivationSpecCmd() {
        super("modifySIBJMSActivationSpec")
    }

    /**
     * New name of the activation specification.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * New JNDI name for the activation specification.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * JNDI name of a destination. The destinationLookup and destinationJndiName parameters serve the same purpose of storing the destination JNDI name in the configuration. Although the two fields individually are not mandatory, you must ensure that at least one of them have a value. When both destinationLookup and destinationJndiName parameters have values, then the destinationLookup parameter takes precedence over destinationJndiName parameter.
     */
    def 'destinationJndiName'(String value) {
        parameter("destinationJndiName", value)
    }

    /**
     * JNDI name of a destination lookup. The destinationLookup and destinationJndiName parameters serve the same purpose of storing the destination JNDI name in the configuration. Although the two fields individually are not mandatory, you must ensure that at least one of them have a value. When both destinationLookup and destinationJndiName parameters have values, then the destinationLookup parameter takes precedence over destinationJndiName parameter.
     */
    def 'destinationLookup'(String value) {
        parameter("destinationLookup", value)
    }

    /**
     * JNDI name of a connection factory lookup.
     */
    def 'connectionFactoryLookup'(String value) {
        parameter("connectionFactoryLookup", value)
    }

    /**
     * A JMS activation specification is used by the default messaging provider to validate the activation-configuration properties for a JMS message-driven bean (MDB).
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * How the session acknowledges any messages it receives.
     */
    def 'acknowledgeMode'(String value) {
        parameter("acknowledgeMode", value)
    }

    /**
     * Authentication alias.
     */
    def 'authenticationAlias'(String value) {
        parameter("authenticationAlias", value)
    }

    /**
     * Name of the bus to connect to.
     */
    def 'busName'(String value) {
        parameter("busName", value)
    }

    /**
     * Client identifier. Required for durable topic subscriptions.
     */
    def 'clientId'(String value) {
        parameter("clientId", value)
    }

    /**
     * Whether the message-driven bean uses a queue or topic destination.
     */
    def 'destinationType'(String value) {
        parameter("destinationType", value)
    }

    /**
     * Name of the durable subscription home. This identifies the messaging engine where all durable subscriptions accessed through this activation specification are managed.
     */
    def 'durableSubscriptionHome'(String value) {
        parameter("durableSubscriptionHome", value)
    }

    /**
     * The maximum number of messages received from the messaging engine in a single batch.
     */
    def 'maxBatchSize'(Integer value) {
        parameter("maxBatchSize", value)
    }

    /**
     * The maximum number of endpoints to which messages are delivered concurrently.
     */
    def 'maxConcurrency'(Integer value) {
        parameter("maxConcurrency", value)
    }

    /**
     * The JMS message selector used to determine which messages the message-driven bean (MDB) receives.
     */
    def 'messageSelector'(String value) {
        parameter("messageSelector", value)
    }

    /**
     * Password.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * Whether a JMS topic subscription is durable or nondurable.
     */
    def 'subscriptionDurability'(String value) {
        parameter("subscriptionDurability", value)
    }

    /**
     * The subscription name needed for durable topic subscriptions.
     */
    def 'subscriptionName'(String value) {
        parameter("subscriptionName", value)
    }

    /**
     * Used to control how durable subscriptions are shared. Legal values are "InCluster", "AlwaysShared" and "NeverShared".
     */
    def 'shareDurableSubscriptions'(String value) {
        parameter("shareDurableSubscriptions", value)
    }

    /**
     * User name.
     */
    def 'userName'(String value) {
        parameter("userName", value)
    }

    /**
     * Read-ahead value. Legal values are "Default", "AlwaysOn" and "AlwaysOff".
     */
    def 'readAhead'(String value) {
        parameter("readAhead", value)
    }

    /**
     * The SIB JMS activation specification new target value.
     */
    def 'target'(String value) {
        parameter("target", value)
    }

    /**
     * The SIB JMS activation specification new target type value. Legal values are "BusMember", "Custom" and "ME".
     */
    def 'targetType'(String value) {
        parameter("targetType", value)
    }

    /**
     * This property specifies the significance of the target group.
     */
    def 'targetSignificance'(String value) {
        parameter("targetSignificance", value)
    }

    /**
     * The name of the protocol that should be used to connect to a remote messaging engine.
     */
    def 'targetTransportChain'(String value) {
        parameter("targetTransportChain", value)
    }

    /**
     * A comma-separated list of endpoint triplets of the form "host:port:chain".
     */
    def 'providerEndPoints'(String value) {
        parameter("providerEndPoints", value)
    }

    /**
     * Used to control how data sources are shared.
     */
    def 'shareDataSourceWithCMP'(Boolean value) {
        parameter("shareDataSourceWithCMP", value)
    }

    /**
     * When enabled, Object Messages received through this activation spec will only have their message data serialized by the system when absolutely necessary. The data obtained from those messages must be treated as readOnly by applications. Legal values are "true" and "false" (default).
     */
    def 'consumerDoesNotModifyPayloadAfterGet'(String value) {
        parameter("consumerDoesNotModifyPayloadAfterGet", value)
    }

    /**
     * When enabled, Object/Bytes Messages forwarded through this activation spec that have their payload modified will not have the data copied when is is set into the message and the system will only serialize the message data when absolutely necessary. Applications sending such messages must not modify the data once it has been set into the message. Legal values are "true" and "false" (default).
     */
    def 'forwarderDoesNotModifyPayloadAfterSet'(String value) {
        parameter("forwarderDoesNotModifyPayloadAfterSet", value)
    }

    /**
     * MDB server-selection rule.  Determines which servers can drive MDBs deployed to them.  This parameter has two possible values: TRUE, FALSE.  Specify TRUE to always activate MDBs in all servers.  Otherwise, only servers with a running messaging engine are used.  
     */
    def 'alwaysActivateAllMDBs'(Boolean value) {
        parameter("alwaysActivateAllMDBs", value)
    }

    /**
     * The delay (in seconds) between attempts to connect to a messaging engine, both for the initial connection, and any subsequent attempts to establish a better connection.  Must be greater than zero.  
     */
    def 'retryInterval'(Integer value) {
        parameter("retryInterval", value)
    }

    /**
     * The endpoint will be stopped when the number of sequentially failing messages reaches the configured limit. Due to processing dependencies in the MDB the actual number of messages processed may exceed this value.
     */
    def 'autoStopSequentialMessageFailure'(Integer value) {
        parameter("autoStopSequentialMessageFailure", value)
    }

    /**
     * Any message that fails to be processed by the MDB but has not reached its maximum failed delivery limit will only be retried after this period of time has passed. Other messages may be tried during this period, unless the sequential failure threshold and the maximum concurrency is set to 1 millisecond.
     */
    def 'failingMessageDelay'(Long value) {
        parameter("failingMessageDelay", value)
    }

}
