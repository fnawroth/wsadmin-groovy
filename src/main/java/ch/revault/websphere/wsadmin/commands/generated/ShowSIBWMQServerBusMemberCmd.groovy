/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Display a named WebSphere MQ server bus members attributes.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBWMQServerBusMemberCmd extends AdminCmd<Void> {
    ShowSIBWMQServerBusMemberCmd() {
        super("showSIBWMQServerBusMember")
    }

    /**
     * The name of the bus the WebSphere MQ server is a member of.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the WebSphere MQ server bus member.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
