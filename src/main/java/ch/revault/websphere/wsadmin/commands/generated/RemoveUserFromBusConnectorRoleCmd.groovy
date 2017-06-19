/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove a user's permission to connect to the specified bus.
*/
@Generated("with GenerateAdminCommands")
class RemoveUserFromBusConnectorRoleCmd extends AdminCmd<Void> {
    RemoveUserFromBusConnectorRoleCmd() {
        super("removeUserFromBusConnectorRole")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * User name
     */
    def 'user'(String value) {
        parameter("user", value)
    }

}
