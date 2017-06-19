/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List inherit defaults for destination (deprecated - use isInheritDefaultsForDestination instead)
*/
@Generated("with GenerateAdminCommands")
class ListInheritDefaultsForDestinationCmd extends AdminCmd<Void> {
    ListInheritDefaultsForDestinationCmd() {
        super("listInheritDefaultsForDestination")
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

}
