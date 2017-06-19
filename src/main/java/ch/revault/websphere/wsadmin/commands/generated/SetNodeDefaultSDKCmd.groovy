/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the default SDK by name or by location for the node
*/
@Generated("with GenerateAdminCommands")
class SetNodeDefaultSDKCmd extends AdminCmd<Void> {
    SetNodeDefaultSDKCmd() {
        super("setNodeDefaultSDK")
    }

    /**
     * The name of the node
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
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

    /**
     * Clear SDK for all servers in the specified node 
     */
    def 'clearServerSDKs'(Boolean value) {
        parameter("clearServerSDKs", value)
    }

}
