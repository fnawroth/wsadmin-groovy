/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the mediations on a bus.
*/
@Generated("with GenerateAdminCommands")
class ListSIBMediationsCmd extends AdminCmd<Void> {
    ListSIBMediationsCmd() {
        super("listSIBMediations")
    }

    /**
     * Name of the bus where the mediations to be listed are to be found.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
