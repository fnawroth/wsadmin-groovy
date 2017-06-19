/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

import static ch.revault.websphere.wsadmin.Script.wsadmin

wsadmin {
    def server_hostname = "WASDEV"

    connect {
        host 'localhost'
        type 'SOAP'
        port '8880'
    }

    def script_nodeName = "${server_hostname}Node01"
    def script_cellName = "${script_nodeName}Cell"
    def script_serverName = "${script_nodeName}.server1"

    scriptScope "Cell=${script_cellName}"

    // Cleanup -------------------------------------------------------------------------------------
    deleteWorkManagerInfo {
        scope "Server"
        name 'sampleWorkManager'
    }
    [ /* put list here*/    ].each { name ->
        deleteDatasource {
            failOnError false
            target listDatasources {}.find { it.canonicalName.contains(name) }
        }
    }
    deleteJDBCProvider {
        failOnError false
        target listJDBCProviders {}.find { it.canonicalName.contains("sample") }
    }
    [/* put list here*/ ].each { name ->
        deleteSIBJMSTopic {
            failOnError false
            target listSIBJMSTopics {}.find { it.canonicalName.contains(name) }
        }
    }
    [/* put list here*/].each { name ->
        deleteSIBJMSQueue {
            failOnError false
            target listSIBJMSQueues {}.find { it.canonicalName.contains(name) }
        }
    }
    [/* put list here*/].each { name ->
        deleteSIBJMSConnectionFactory {
            failOnError false
            target listSIBJMSConnectionFactories { type 'all' }
                    .find { it.canonicalName.contains(name) }
        }
    }
    [/* put list here*/].each { name ->
        deleteSIBJMSActivationSpec {
            failOnError false
            target listSIBJMSActivationSpecs {}.find { it.canonicalName.contains(name) }
        }
    }
    deleteSIBus {
        failOnError false
        bus "sampleBus"
    }
    [/* put list here*/].each { name ->
        deleteAuthDataEntry {
            failOnError false
            alias "${script_nodeName}/${name}"
        }
    }

    // Create -------------------------------------------------------------------------------------
    createWorkManagerInfo {
        scope "Server"
        name 'sampleWorkManager'
        jndiName 'wm/sampleWorkManager'
        maxThreads 2
        minThreads 0
        numAlarmThreads 2
        threadPriority 5
        isGrowable true
    }
    createAuthDataEntry {
        alias "sampleDB"
        user "sample"
        password "samplepass"
    }

    // Path to jcc driver libs
    setVariable {
        scope "Node"
        variableName "DB2_JCC_DRIVER_PATH"
        variableValue 'C:/IBM/SQLLIB/java'
    }
    def sampleJdbcProvider = createJDBCProvider {
        databaseType 'DB2'
        providerType 'DB2 Universal JDBC Driver Provider'
        implementationType 'XA data source'
        name 'sample JDBC Provider'
        description 'sample JDBC Provider XA'
        classpath  '${DB2_JCC_DRIVER_PATH}/db2jcc4.jar',
                '${UNIVERSAL_JDBC_DRIVER_PATH}/db2jcc_license_cu.jar',
                '${DB2_JCC_DRIVER_PATH}/db2jcc_license_cisuz.jar'
        nativePath '${DB2_JCC_DRIVER_NATIVEPATH}'
    }

    createDatasource {
        target sampleJdbcProvider
        name "sampledb"
        jndiName "jdbc/sampledb"
        dataStoreHelperClassName 'com.ibm.websphere.rsadapter.DB2UniversalDataStoreHelper'
        componentManagedAuthenticationAlias "${script_nodeName}/usermofis"
        step {
            stepName "configureResourceProperties"
            rows {
                databaseName "sampledb"
                serverName "servername"
                portNumber 50010
            }
        }
    }
    modifyDatasourceMappingModule {
        datasourceName "sampledb"
        authDataAlias "${script_nodeName}/sampledb"
        mappingConfigAlias "DefaultPrincipalMapping"
    }
    createSIBus {
        bus "sampleBus"
    }
    addSIBusMember {
        bus "sampleBus"
        node "${script_nodeName}"
        server "server1"
    }
    createSIBJMSConnectionFactory {
        name 'QueueConnectionFactory'
        jndiName 'jms/QueueConnectionFactory'
        busName 'sampleBus'
        type 'queue'
        providerEndPoints "${server_hostname}:7276:BootstrapBasicMessaging"
    }
    createSIBDestination {
        name "QL_INCOMING_GATEWAY"
        bus "sampleBus"
        type "Queue"
        node "${script_nodeName}"
        server "server1"
    }
    createSIBJMSQueue {
        name "QL_INCOMING_GW"
        jndiName "jms/IncomingQueue"
        busName "sampleBus"
        queueName "QL_INCOMING_GATEWAY"
    }
    createSIBDestination {
        name "sampleTopics"
        bus "sampleBus"
        type "TopicSpace"
        node "${script_nodeName}"
        server "server1"
    }
    createSIBJMSTopic {
        name "DispatcherTopic"
        jndiName "jms/DispatcherTopic"
        topicName "topicname"
        busName "sampleBus"
        topicSpace "sampleTopics"
    }
    createSIBJMSActivationSpec {
        name "IncomingMessageSpec"
        jndiName "eis/IncomingMessageSpec"
        destinationType "Queue"
        destinationJndiName "jms/IncomingQueue"
        busName "sampleBus"
        durableSubscriptionHome "${script_serverName}-sampleBus"
    }
    save {
        overwriteOnConflict true
    }
}