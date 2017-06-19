/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Give a group permission to connect to the bus specified.
*/
@Generated("with GenerateAdminCommands")
class AddGroupToBusConnectorRoleCmd extends AdminCmd<Void> {
    AddGroupToBusConnectorRoleCmd() {
        super("addGroupToBusConnectorRole")
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

    /**
     * The name that uniquely defines the user or group in the registry
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

}
