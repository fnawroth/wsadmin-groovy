/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes all destination roles defined for the specified destination in the specified bus.
*/
@Generated("with GenerateAdminCommands")
class RemoveDestinationRolesCmd extends AdminCmd<Void> {
    RemoveDestinationRolesCmd() {
        super("removeDestinationRoles")
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

}
