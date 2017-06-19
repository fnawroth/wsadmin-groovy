/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a named bus, including everything on it.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBusCmd extends AdminCmd<Void> {
    DeleteSIBusCmd() {
        super("deleteSIBus")
    }

    /**
     * Name of bus to be deleted from the current cell.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
