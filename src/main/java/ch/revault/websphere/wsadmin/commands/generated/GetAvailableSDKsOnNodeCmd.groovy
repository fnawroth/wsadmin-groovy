/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of names for the SDKs on a given node.
*/
@Generated("with GenerateAdminCommands")
class GetAvailableSDKsOnNodeCmd extends AdminCmd<Void> {
    GetAvailableSDKsOnNodeCmd() {
        super("getAvailableSDKsOnNode")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
