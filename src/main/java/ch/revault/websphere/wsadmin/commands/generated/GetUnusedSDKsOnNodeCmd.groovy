/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Query unused SDKs on the node
*/
@Generated("with GenerateAdminCommands")
class GetUnusedSDKsOnNodeCmd extends AdminCmd<Void> {
    GetUnusedSDKsOnNodeCmd() {
        super("getUnusedSDKsOnNode")
    }

    /**
     * The name of the node
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
