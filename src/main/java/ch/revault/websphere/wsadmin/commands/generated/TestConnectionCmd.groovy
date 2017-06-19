/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This is a test function used exclusively by the development
*/
@Generated("with GenerateAdminCommands")
class TestConnectionCmd extends AdminCmd<Void> {
    TestConnectionCmd() {
        super("testConnection")
    }

    /**
     * Id of the managed node that polls
     */
    def 'uuid'(String value) {
        parameter("uuid", value)
    }

    /**
     * Id of the JobManager to be polled by the managed node
     */
    def 'jobManagerUUID'(String value) {
        parameter("jobManagerUUID", value)
    }

    /**
     * serverUrl
     */
    def 'serverUrl'(String value) {
        parameter("serverUrl", value)
    }

    /**
     * serverId
     */
    def 'serverId'(String value) {
        parameter("serverId", value)
    }

    /**
     * serverPwd
     */
    def 'serverPwd'(String value) {
        parameter("serverPwd", value)
    }

    /**
     * clientId
     */
    def 'clientId'(String value) {
        parameter("clientId", value)
    }

    /**
     * clientPwd
     */
    def 'clientPwd'(String value) {
        parameter("clientPwd", value)
    }

}
