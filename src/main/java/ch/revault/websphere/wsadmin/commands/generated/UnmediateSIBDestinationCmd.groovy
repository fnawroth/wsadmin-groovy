/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Mediate a destination.
*/
@Generated("with GenerateAdminCommands")
class UnmediateSIBDestinationCmd extends AdminCmd<Void> {
    UnmediateSIBDestinationCmd() {
        super("unmediateSIBDestination")
    }

    /**
     * The name of the bus where the destination is currently mediated.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the destination to be unmediated.
     */
    def 'destinationName'(String value) {
        parameter("destinationName", value)
    }

}
