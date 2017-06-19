/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete bridge interfaces associated with a specified core group, node and server.
*/
@Generated("with GenerateAdminCommands")
class RemoveCoreGroupBridgeInterfaceCmd extends AdminCmd<Void> {
    RemoveCoreGroupBridgeInterfaceCmd() {
        super("removeCoreGroupBridgeInterface")
    }

    /**
     * Name of the Core group whose core group access points will be deleted.
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

    /**
     * Name of the node whose bridge interface will be deleted.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Name of the server whose core bridge interface will be deleted.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

}
