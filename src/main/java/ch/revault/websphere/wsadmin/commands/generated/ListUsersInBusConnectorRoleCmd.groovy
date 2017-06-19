/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the users in the Bus Connector Role
*/
@Generated("with GenerateAdminCommands")
class ListUsersInBusConnectorRoleCmd extends AdminCmd<Void> {
    ListUsersInBusConnectorRoleCmd() {
        super("listUsersInBusConnectorRole")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * SHOW_UNIQUE_NAMES_DESCRIPTION
     */
    def 'showUniqueNames'(Boolean value) {
        parameter("showUniqueNames", value)
    }

}
