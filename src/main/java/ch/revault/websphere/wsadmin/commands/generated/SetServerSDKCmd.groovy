/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set server SDK by name or by location
*/
@Generated("with GenerateAdminCommands")
class SetServerSDKCmd extends AdminCmd<Void> {
    SetServerSDKCmd() {
        super("setServerSDK")
    }

    /**
     * The name of the node
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The name of the server
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The name of the cluster
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

    /**
     * The name of the SDK
     */
    def 'sdkName'(String value) {
        parameter("sdkName", value)
    }

    /**
     * The path of JAVA_HOME
     */
    def 'javahome'(String value) {
        parameter("javahome", value)
    }

}
