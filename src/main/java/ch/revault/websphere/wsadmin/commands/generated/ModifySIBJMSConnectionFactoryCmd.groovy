/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify the attributes of the supplied SIB JMS connection factory using the supplied attribute values.
*/
@Generated("with GenerateAdminCommands")
class ModifySIBJMSConnectionFactoryCmd extends AdminCmd<Void> {
    ModifySIBJMSConnectionFactoryCmd() {
        super("modifySIBJMSConnectionFactory")
    }

    /**
     * The name of the SIB JMS connection factory.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The JNDI name of the SIB JMS connection factory.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * Specifies a user ID and password to be used to authenticate connections to the JMS provider for application-managed authentication.
     */
    def 'authDataAlias'(String value) {
        parameter("authDataAlias", value)
    }

    /**
     * Specifies a container managed authentication alias, from which security credentials are to be used when establishing a connection to the JMS provider.
     */
    def 'containerAuthAlias'(String value) {
        parameter("containerAuthAlias", value)
    }

    /**
     * Specifies the JAAS mapping alias to use when determining the security related credentials to use when establishing a connection to the JMS provider.
     */
    def 'mappingAlias'(String value) {
        parameter("mappingAlias", value)
    }

    /**
     * Classifies or groups the connection factory.
     */
    def 'category'(String value) {
        parameter("category", value)
    }

    /**
     * The SIB JMS connection factory's new description.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Whether or not the container logs that there is a missing transaction context when a connection is obtained.
     */
    def 'logMissingTransactionContext'(Boolean value) {
        parameter("logMissingTransactionContext", value)
    }

    /**
     * Whether cached handles (handles held in instance variables in a bean) should be tracked by the container.
     */
    def 'manageCachedHandles'(Boolean value) {
        parameter("manageCachedHandles", value)
    }

    /**
     * The authentication alias used during XA recovery processing.
     */
    def 'xaRecoveryAuthAlias'(String value) {
        parameter("xaRecoveryAuthAlias", value)
    }

    /**
     * The SIB JMS connection factory's new bus name value.
     */
    def 'busName'(String value) {
        parameter("busName", value)
    }

    /**
     * The SIB JMS connection factory's new client ID value.
     */
    def 'clientID'(String value) {
        parameter("clientID", value)
    }

    /**
     * The SIB JMS connection factory's new user name value.
     */
    def 'userName'(String value) {
        parameter("userName", value)
    }

    /**
     * The SIB JMS connection factory's new password value.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * The SIB JMS connection factory's new non-persistent mapping value. Legal values are "BestEffortNonPersistent", "ExpressNonPersistent", "ReliableNonPersistent", "ReliablePersistent", "AssuredPersistent", "AsSIBDestination" and "None".
     */
    def 'nonPersistentMapping'(String value) {
        parameter("nonPersistentMapping", value)
    }

    /**
     * The SIB JMS connection factory's new persistent mapping value. Legal values are "BestEffortNonPersistent", "ExpressNonPersistent", "ReliableNonPersistent", "ReliablePersistent", "AssuredPersistent", "AsSIBDestination" and "None".
     */
    def 'persistentMapping'(String value) {
        parameter("persistentMapping", value)
    }

    /**
     * The SIB JMS connection factory's new durable subscription home value.
     */
    def 'durableSubscriptionHome'(String value) {
        parameter("durableSubscriptionHome", value)
    }

    /**
     * The SIB JMS connection factory's new read-ahead value. Legal values are "Default", "AlwaysOn" and "AlwaysOff".
     */
    def 'readAhead'(String value) {
        parameter("readAhead", value)
    }

    /**
     * The SIB JMS connection factory's new target value.
     */
    def 'target'(String value) {
        parameter("target", value)
    }

    /**
     * The SIB JMS connection factory's new target type value. Legal values are "BusMember", "Custom" and "ME".
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
     * The SIB JMS connection factory's new remote protocol value.
     */
    def 'targetTransportChain'(String value) {
        parameter("targetTransportChain", value)
    }

    /**
     * The SIB JMS connection factory's new provider endpoints value.
     */
    def 'providerEndPoints'(String value) {
        parameter("providerEndPoints", value)
    }

    /**
     * The SIB JMS connection factory's new connection proximity value. Legal values are "Bus", "Host", "Cluster" and "Server".
     */
    def 'connectionProximity'(String value) {
        parameter("connectionProximity", value)
    }

    /**
     * The SIB JMS connection factory's new temporary queue name prefix value.
     */
    def 'tempQueueNamePrefix'(String value) {
        parameter("tempQueueNamePrefix", value)
    }

    /**
     * The SIB JMS connection factory's new temporary topic name prefix value.
     */
    def 'tempTopicNamePrefix'(String value) {
        parameter("tempTopicNamePrefix", value)
    }

    /**
     * Used to control how data sources are shared.
     */
    def 'shareDataSourceWithCMP'(Boolean value) {
        parameter("shareDataSourceWithCMP", value)
    }

    /**
     * Used to control how durable subscriptions are shared. Legal values are "InCluster", "AlwaysShared" and "NeverShared".
     */
    def 'shareDurableSubscriptions'(String value) {
        parameter("shareDurableSubscriptions", value)
    }

    /**
     * When enabled, Object/Bytes Messages received by a message consuming application that has connected to the bus using this connection factory will only have their message data serialized by the system when absolutely necessary. The data obtained from those messages must be treated as readOnly by applications. Legal values are "true" and "false" (default).
     */
    def 'consumerDoesNotModifyPayloadAfterGet'(String value) {
        parameter("consumerDoesNotModifyPayloadAfterGet", value)
    }

    /**
     * When enabled, Object/Bytes Messages sent by a message producing application that has connected to the bus using this connection factory will not have their data copied when set and the system will only serialize the message data when absolutely necessary. Applications sending such messages must not modify the data once it has been set into the message. Legal values are "true" and "false" (default).
     */
    def 'producerDoesNotModifyPayloadAfterSet'(String value) {
        parameter("producerDoesNotModifyPayloadAfterSet", value)
    }

}
