/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Display a named WebSphere MQ server's attributes.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBWMQServerCmd extends AdminCmd<Void> {
    ShowSIBWMQServerCmd() {
        super("showSIBWMQServer")
    }

    /**
     * The name of the WebSphere MQ server. This is for administrative purposes only and can be decided by the administrator. The name is only meaningful inside WebSphere Application server administration, and must be unique at cell level.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
