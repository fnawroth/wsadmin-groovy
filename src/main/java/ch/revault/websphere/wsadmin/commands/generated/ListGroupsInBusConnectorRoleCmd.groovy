/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the groups in the bus connector role
*/
@Generated("with GenerateAdminCommands")
class ListGroupsInBusConnectorRoleCmd extends AdminCmd<Void> {
    ListGroupsInBusConnectorRoleCmd() {
        super("listGroupsInBusConnectorRole")
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
