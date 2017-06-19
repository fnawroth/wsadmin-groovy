/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add a member to a bus.
*/
@Generated("with GenerateAdminCommands")
class AddSIBusMemberCmd extends AdminCmd<Void> {
    AddSIBusMemberCmd() {
        super("addSIBusMember")
    }

    /**
     * Name of bus to add member to.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * To specify a server bus member, supply node and server name, but not cluster name or WebSphere MQ server name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To specify a server bus member, supply node and server name, but not cluster name or WebSphere MQ server name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To specify a cluster bus member, supply cluster name, but not node name, server name or WebSphere MQ server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * To specify a WebSphere MQ server bus member, supply a WebSphere MQ server name, but not node name, server name or cluster name.
     */
    def 'wmqServer'(String value) {
        parameter("wmqServer", value)
    }

    /**
     * Select this option to enable messaging engine policy assistance. A policy name must also be supplied.
     */
    def 'enableAssistance'(Boolean value) {
        parameter("enableAssistance", value)
    }

    /**
     * The name of the policy that the messaging engine policy assistance should apply. Messaging engine policy assistance must be enabled.
     */
    def 'policyName'(String value) {
        parameter("policyName", value)
    }

    /**
     * This is the override host name of the host to which a connection will be established in order to communicate with a WebSphere MQ queue manager or a WebSphere MQ queue sharing group, supply with a WebSphere MQ server name, but not node name, server name or cluster name.
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * This is the override port number monitored by a WebSphere MQ queue manager or WebSphere MQ queue sharing group listener, which is listening for connections, supply with a WebSphere MQ server name, but not node name, server name or cluster name.
     */
    def 'port'(Integer value) {
        parameter("port", value)
    }

    /**
     * This is the override name of the WebSphere MQ server connection channel that will be used to establish a connection to the WebSphere MQ queue manager or WebSphere MQ queue sharing group, supply with a WebSphere MQ server name, but not node name, server name or cluster name.
     */
    def 'channel'(String value) {
        parameter("channel", value)
    }

    /**
     * The authentication alias that will be supplied when connecting to the WebSphere MQ server, supply with a WebSphere MQ server name, but not node name, server name or cluster name.
     */
    def 'securityAuthAlias'(String value) {
        parameter("securityAuthAlias", value)
    }

    /**
     * Overridden value for the WebSphere MQ server bus member "transportChain" attribute.  Refer to the createSIBWMQServer command for a description of this parameter.
     */
    def 'transportChain'(String value) {
        parameter("transportChain", value)
    }

    /**
     * Overridden value for the WebSphere MQ server bus member "trustUserIds" attribute.  Refer to the createSIBWMQServer command for a description of this parameter
     */
    def 'trustUserIds'(Boolean value) {
        parameter("trustUserIds", value)
    }

    /**
     * Indicates that a file store is to be created. No value is needed.
     */
    def 'fileStore'(String value) {
        parameter("fileStore", value)
    }

    /**
     * Indicates that a data store is to be created. No value is needed.
     */
    def 'dataStore'(String value) {
        parameter("dataStore", value)
    }

    /**
     * The size, in megabytes, of the log file.
     */
    def 'logSize'(java.lang.Long value) {
        parameter("logSize", value)
    }

    /**
     * The minimum size, in megabytes, of the permanent store file.
     */
    def 'minPermanentStoreSize'(java.lang.Long value) {
        parameter("minPermanentStoreSize", value)
    }

    /**
     * The maximum size, in megabytes, of the permanent store file.
     */
    def 'maxPermanentStoreSize'(java.lang.Long value) {
        parameter("maxPermanentStoreSize", value)
    }

    /**
     * True if the permanent file store size has no limit, false otherwise.
     */
    def 'unlimitedPermanentStoreSize'(Boolean value) {
        parameter("unlimitedPermanentStoreSize", value)
    }

    /**
     * The name of the store files directory for permanent data.
     */
    def 'permanentStoreDirectory'(String value) {
        parameter("permanentStoreDirectory", value)
    }

    /**
     * The minimum size, in megabytes, of the temporary store file.
     */
    def 'minTemporaryStoreSize'(java.lang.Long value) {
        parameter("minTemporaryStoreSize", value)
    }

    /**
     * The maximum size, in megabytes, of the temporary store file.
     */
    def 'maxTemporaryStoreSize'(java.lang.Long value) {
        parameter("maxTemporaryStoreSize", value)
    }

    /**
     * True if the temporary file store size has no limit, false otherwise.
     */
    def 'unlimitedTemporaryStoreSize'(Boolean value) {
        parameter("unlimitedTemporaryStoreSize", value)
    }

    /**
     * The name of the store files directory for temporary data.
     */
    def 'temporaryStoreDirectory'(String value) {
        parameter("temporaryStoreDirectory", value)
    }

    /**
     * The name of the log files directory.
     */
    def 'logDirectory'(String value) {
        parameter("logDirectory", value)
    }

    /**
     * When adding a server to a bus, set this to true if a default datasource is required. When adding a cluster to a bus, this parameter must not be supplied.
     */
    def 'createDefaultDatasource'(Boolean value) {
        parameter("createDefaultDatasource", value)
    }

    /**
     * The JNDI name of the datasource to be referenced from the datastore created when the member is added to the bus.
     */
    def 'datasourceJndiName'(String value) {
        parameter("datasourceJndiName", value)
    }

    /**
     * The name of the authentication alias used to authenticate the messaging engine to the data source.
     */
    def 'authAlias'(String value) {
        parameter("authAlias", value)
    }

    /**
     * Select this option if the messaging engine creates the database tables for the data store. Otherwise, the database administrator must create the database tables.
     */
    def 'createTables'(Boolean value) {
        parameter("createTables", value)
    }

    /**
     * The name of the database schema used to contain the tables for the data store.
     */
    def 'schemaName'(String value) {
        parameter("schemaName", value)
    }

    /**
     * Indicates that the messaging engine created can failover to other servers. This option can be used when messaging engine policy assistance is enabled and the "CUSTOM" policy is selected. 
     */
    def 'failover'(Boolean value) {
        parameter("failover", value)
    }

    /**
     * Indicates that the messaging engine created can fail back to a preferred server. This option can be used when messaging engine policy assistance is enabled and the "CUSTOM" policy is selected. 
     */
    def 'failback'(Boolean value) {
        parameter("failback", value)
    }

    /**
     * The initial JVM heap size in MB of the server, or of each server in the cluster, will be set to this value.
     */
    def 'initialHeapSize'(Integer value) {
        parameter("initialHeapSize", value)
    }

    /**
     * The maximum JVM heap size in MB of the server, or of each server in the cluster, will be set to this value.
     */
    def 'maxHeapSize'(Integer value) {
        parameter("maxHeapSize", value)
    }

    /**
     * Indicates that the messaging engine created can failover to other servers. This option can be used when messaging engine policy assistance is enabled and the "CUSTOM" policy is selected.
     */
    def 'preferredServersOnly'(Boolean value) {
        parameter("preferredServersOnly", value)
    }

    /**
     * The virtual queue manager name of the SIBus that the WebSphere MQ queue manager sees.
     */
    def 'virtualQueueManagerName'(String value) {
        parameter("virtualQueueManagerName", value)
    }

    /**
     * Select this option to restrict the messaging engine from holding long enduring database locks.
     */
    def 'restrictLongDBLock'(Boolean value) {
        parameter("restrictLongDBLock", value)
    }

}
