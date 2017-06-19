/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a user from the specified destination role for the specified destination.
*/
@Generated("with GenerateAdminCommands")
class RemoveUserFromDestinationRoleCmd extends AdminCmd<Void> {
    RemoveUserFromDestinationRoleCmd() {
        super("removeUserFromDestinationRole")
    }

    /**
     * The destination type.  Allowable values are ( Queue | Port | Webservice | TopicSpace | ForeignDestination | Alias )
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Foreign Bus name
     */
    def 'foreignBus'(String value) {
        parameter("foreignBus", value)
    }

    /**
     * Destination name
     */
    def 'destination'(String value) {
        parameter("destination", value)
    }

    /**
     * The role name.  Allowable values are: for Queues/Ports/WebServices ( Sender | Receiver | Browser | Creator | IdentityAdopter ), for TopicSpaces ( Sender | Receiver | IdentityAdopter ), for Aliases ( Sender | Receiver | Browser | IdentityAdopter ), for Foreign ( Sender | IdentityAdopter )
     */
    def 'role'(String value) {
        parameter("role", value)
    }

    /**
     * User name
     */
    def 'user'(String value) {
        parameter("user", value)
    }

}
