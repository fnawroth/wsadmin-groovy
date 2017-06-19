/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* returns the server type of the specified server.
*/
@Generated("with GenerateAdminCommands")
class GetServerTypeCmd extends AdminCmd<Void> {
    GetServerTypeCmd() {
        super("getServerType")
    }

    /**
     * The Server Name
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The Node Name
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
