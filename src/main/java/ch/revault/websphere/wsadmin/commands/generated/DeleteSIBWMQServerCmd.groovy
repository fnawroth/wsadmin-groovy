/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a named WebSphere MQ server. Also, delete its membership of any buses, and cleanup all associated configuration.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBWMQServerCmd extends AdminCmd<Void> {
    DeleteSIBWMQServerCmd() {
        super("deleteSIBWMQServer")
    }

    /**
     * The name of the WebSphere MQ server. This is for administrative purposes only and can be decided by the administrator. The name is only meaningful inside WebSphere Application server administration, and must be unique at cell level.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
