/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a server configuration
*/
@Generated("with GenerateAdminCommands")
class DeleteServerCmd extends AdminCmd<Void> {
    DeleteServerCmd() {
        super("deleteServer")
    }

    /**
     * Server Name
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * Node Name
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
