/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show the attributes of a bus.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBusCmd extends AdminCmd<Void> {
    ShowSIBusCmd() {
        super("showSIBus")
    }

    /**
     * Name of bus to show.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
