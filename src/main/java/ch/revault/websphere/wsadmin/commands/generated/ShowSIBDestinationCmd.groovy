/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show a bus destination's attributes.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBDestinationCmd extends AdminCmd<Void> {
    ShowSIBDestinationCmd() {
        super("showSIBDestination")
    }

    /**
     * Bus name.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Destination name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
