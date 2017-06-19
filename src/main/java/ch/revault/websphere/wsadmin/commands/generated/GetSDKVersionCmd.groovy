/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Query the SDK version number in use
*/
@Generated("with GenerateAdminCommands")
class GetSDKVersionCmd extends AdminCmd<Void> {
    GetSDKVersionCmd() {
        super("getSDKVersion")
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
     * Whether to get the highest version (vs. the lowest)
     */
    def 'highest'(Boolean value) {
        parameter("highest", value)
    }

}
