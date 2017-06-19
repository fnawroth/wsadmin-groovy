/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the members on a bus.
*/
@Generated("with GenerateAdminCommands")
class ListSIBusMembersCmd extends AdminCmd<Void> {
    ListSIBusMembersCmd() {
        super("listSIBusMembers")
    }

    /**
     * Name of bus whose bus members are to be listed.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
