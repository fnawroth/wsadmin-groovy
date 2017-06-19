/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Allows the override for inheritance for an individual destination.  Setting the "inherit" value to true will allow the destination to inherit from the default values.
*/
@Generated("with GenerateAdminCommands")
class SetInheritDefaultsForDestinationCmd extends AdminCmd<Void> {
    SetInheritDefaultsForDestinationCmd() {
        super("setInheritDefaultsForDestination")
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
     * Destination name
     */
    def 'destination'(String value) {
        parameter("destination", value)
    }

    /**
     * Inherit destination defaults (True by default)
     */
    def 'inherit'(Boolean value) {
        parameter("inherit", value)
    }

}
