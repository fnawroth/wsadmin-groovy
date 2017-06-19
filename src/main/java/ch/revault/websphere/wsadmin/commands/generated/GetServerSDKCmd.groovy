/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Query the server's SDK name and location
*/
@Generated("with GenerateAdminCommands")
class GetServerSDKCmd extends AdminCmd<Void> {
    GetServerSDKCmd() {
        super("getServerSDK")
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
     * Whether to check the SDK variable for the server only
     */
    def 'checkVariableOnly'(Boolean value) {
        parameter("checkVariableOnly", value)
    }

}
