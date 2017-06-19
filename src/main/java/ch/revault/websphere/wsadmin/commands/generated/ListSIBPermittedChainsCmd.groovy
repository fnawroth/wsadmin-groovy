/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the permitted chains for the specified bus.
*/
@Generated("with GenerateAdminCommands")
class ListSIBPermittedChainsCmd extends AdminCmd<Void> {
    ListSIBPermittedChainsCmd() {
        super("listSIBPermittedChains")
    }

    /**
     * The name of the bus to list the permitted chains from.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
