/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete bus destinations.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBDestinationsCmd extends AdminCmd<Void> {
    DeleteSIBDestinationsCmd() {
        super("deleteSIBDestinations")
    }

    /**
     * Bus name.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * If the destination to be deleted is an alias destination, then the aliasBus parameter must be supplied if the alias bus for the destination is not the local bus.
     */
    def 'aliasBus'(String value) {
        parameter("aliasBus", value)
    }

    /**
     * If the destination to be deleted is a foreign destination then name of the foreign bus must be supplied.
     */
    def 'foreignBus'(String value) {
        parameter("foreignBus", value)
    }

}
