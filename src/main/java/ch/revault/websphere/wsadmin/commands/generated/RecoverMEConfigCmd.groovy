/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use this command if there is no configuration data of crashed ME and user needs to recover persistent SBus ME data from message store.
*/
@Generated("with GenerateAdminCommands")
class RecoverMEConfigCmd extends AdminCmd<Void> {
    RecoverMEConfigCmd() {
        super("recoverMEConfig")
    }

    /**
     * Name of bus for which the ME configuration data will be recovered.
     */
    def 'busName'(String value) {
        parameter("busName", value)
    }

    /**
     * Give the node name under the scope of which ME configuration data will be recovered.If this is specified then server name should also be given. 
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Give the server name under the scope of which ME configuration data will be recovered.If this is specified then nodename should also be given. This server will be added as bus member.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * Give the cluster name under the scope of which ME configuration data will be recovered.The cluster will be added as bus member
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

    /**
     * This value specifies the message store type of the messaging engine. The value should be either FILE or DB.
     */
    def 'messageStore'(String value) {
        parameter("messageStore", value)
    }

    /**
     * Give the datasource name.This is mandatory if messagestore is DB.
     */
    def 'dataSource'(String value) {
        parameter("dataSource", value)
    }

    /**
     * Give the schema name of the database from which the ME configuration data will be recovered.This is mandatory if messagestore is DB.
     */
    def 'schemaName'(String value) {
        parameter("schemaName", value)
    }

    /**
     * Give the directory name in quotes for the logging directory of file system to recover configuration data.This is mandatory if messagestore is FILE.
     */
    def 'logDirectory'(String value) {
        parameter("logDirectory", value)
    }

    /**
     * Give the directory name in quotes for the permanent directory of file system to recover configuration data.This is mandatory if messagestore is FILE.
     */
    def 'permLogDirectory'(String value) {
        parameter("permLogDirectory", value)
    }

    /**
     * Give the directory name in quotes for the temporary directory of file system to recover configuration data.This is mandatory if messagestore is FILE.
     */
    def 'tempLogDirectory'(String value) {
        parameter("tempLogDirectory", value)
    }

}
