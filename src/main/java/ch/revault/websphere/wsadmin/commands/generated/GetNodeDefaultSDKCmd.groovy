/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Query the node's default SDK name and location
*/
@Generated("with GenerateAdminCommands")
class GetNodeDefaultSDKCmd extends AdminCmd<Void> {
    GetNodeDefaultSDKCmd() {
        super("getNodeDefaultSDK")
    }

    /**
     * The name of the node
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
