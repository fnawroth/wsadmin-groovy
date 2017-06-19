/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* create sysplex node group
*/
@Generated("with GenerateAdminCommands")
class CreateSysplexNodeGroupCmd extends AdminCmd<Void> {
    CreateSysplexNodeGroupCmd() {
        super("createSysplexNodeGroup")
    }

    /**
     * the shortName (alias) of the node group
     */
    def 'shortName'(String value) {
        parameter("shortName", value)
    }

    /**
     * a description for the node group
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Sysplex Name
     */
    def 'sysplexName'(String value) {
        parameter("sysplexName", value)
    }

    /**
     * Daemon ICU DATA
     */
    def 'icuData'(String value) {
        parameter("icuData", value)
    }

    /**
     * Daemon Name
     */
    def 'daemonName'(String value) {
        parameter("daemonName", value)
    }

    /**
     * Daemon Job Name
     */
    def 'jobName'(String value) {
        parameter("jobName", value)
    }

    /**
     * Daemon generic server name
     */
    def 'serverGenericShortName'(String value) {
        parameter("serverGenericShortName", value)
    }

    /**
     * Daemon generic uuid
     */
    def 'serverGenericUuid'(String value) {
        parameter("serverGenericUuid", value)
    }

    /**
     * Daemon IP Port
     */
    def 'port'(String value) {
        parameter("port", value)
    }

    /**
     * Daemon SSL port
     */
    def 'sslPort'(String value) {
        parameter("sslPort", value)
    }

    /**
     * Daemon IP Address
     */
    def 'ipAddress'(String value) {
        parameter("ipAddress", value)
    }

    /**
     * Daemon SSL repertoire
     */
    def 'sslRepertoire'(String value) {
        parameter("sslRepertoire", value)
    }

    /**
     * Daemon group name
     */
    def 'groupName'(String value) {
        parameter("groupName", value)
    }

}
