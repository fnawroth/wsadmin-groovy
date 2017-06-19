/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all WebSphere MQ servers.
*/
@Generated("with GenerateAdminCommands")
class ListSIBWMQServerBusMembersCmd extends AdminCmd<Void> {
    ListSIBWMQServerBusMembersCmd() {
        super("listSIBWMQServerBusMembers")
    }

    /**
     * The name of the bus the WebSphere MQ server is a member of.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
