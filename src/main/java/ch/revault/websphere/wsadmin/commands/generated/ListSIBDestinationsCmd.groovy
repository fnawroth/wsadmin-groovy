/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List destinations belonging to a bus.
*/
@Generated("with GenerateAdminCommands")
class ListSIBDestinationsCmd extends AdminCmd<Void> {
    ListSIBDestinationsCmd() {
        super("listSIBDestinations")
    }

    /**
     * Bus name.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The type of destination to list. (Queue | TopicSpace | WebService | Port).
     */
    def 'type'(String value) {
        parameter("type", value)
    }

}
