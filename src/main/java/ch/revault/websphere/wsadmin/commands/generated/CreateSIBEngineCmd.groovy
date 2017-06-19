/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a messaging engine.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBEngineCmd extends AdminCmd<Void> {
    CreateSIBEngineCmd() {
        super("createSIBEngine")
    }

    /**
     * The name of the bus to which the messaging engine is to belong.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * To create a messaging engine on a server, supply node and server name, but not cluster name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To create a messaging engine on a server, supply node and server name, but not cluster name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To create a messaging engine on a cluster, supply cluster name, but not node and server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * Description of the messaging engine.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Whether the messaging engine is started or stopped when the associated application server is first started. Until started, the messaging engine is unavailable. (Stopped | Started).
     */
    def 'initialState'(String value) {
        parameter("initialState", value)
    }

    /**
     * The maximum total number of messages that the messaging engine can place on its message points.
     */
    def 'highMessageThreshold'(java.lang.Long value) {
        parameter("highMessageThreshold", value)
    }

    /**
     * The default blocked retry interval for destinations owned by this messaging engine.
     */
    def 'defaultBlockedRetryTimeout'(java.lang.Long value) {
        parameter("defaultBlockedRetryTimeout", value)
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
     * The minimum size in megabytes of the permanent store file.
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
     * The name of the permanent store files directory.
     */
    def 'permanentStoreDirectory'(String value) {
        parameter("permanentStoreDirectory", value)
    }

    /**
     * The minimum size in megabytes of the temporary store file.
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
     * The name of the temporary store files directory.
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
     * Indicates that the messaging engine created can failover to other servers. This option can be used when messaging engine policy assistance is enabled and the "CUSTOM" policy is selected.
     */
    def 'preferredServersOnly'(Boolean value) {
        parameter("preferredServersOnly", value)
    }

    /**
     * Select this option to restrict the messaging engine from holding long enduring database locks.
     */
    def 'restrictLongDBLock'(Boolean value) {
        parameter("restrictLongDBLock", value)
    }

}
