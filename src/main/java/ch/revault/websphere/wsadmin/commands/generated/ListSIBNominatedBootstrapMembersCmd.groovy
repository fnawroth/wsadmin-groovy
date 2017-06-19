/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the servers or clusters that have been nominated for bootstrap into the specified bus.
*/
@Generated("with GenerateAdminCommands")
class ListSIBNominatedBootstrapMembersCmd extends AdminCmd<Void> {
    ListSIBNominatedBootstrapMembersCmd() {
        super("listSIBNominatedBootstrapMembers")
    }

    /**
     * Name of the bus to list the servers or clusters that have been configured as bootstrap members.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
