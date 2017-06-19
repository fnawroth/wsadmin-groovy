/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove a group's permission to connect to the specified bus.
*/
@Generated("with GenerateAdminCommands")
class RemoveGroupFromBusConnectorRoleCmd extends AdminCmd<Void> {
    RemoveGroupFromBusConnectorRoleCmd() {
        super("removeGroupFromBusConnectorRole")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Group name
     */
    def 'group'(String value) {
        parameter("group", value)
    }

}
