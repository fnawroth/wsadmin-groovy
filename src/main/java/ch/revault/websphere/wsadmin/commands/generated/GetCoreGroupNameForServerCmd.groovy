/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the name of the core group the server is a member of.
*/
@Generated("with GenerateAdminCommands")
class GetCoreGroupNameForServerCmd extends AdminCmd<Void> {
    GetCoreGroupNameForServerCmd() {
        super("getCoreGroupNameForServer")
    }

    /**
     * The name of the node hosting the server
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

}
