/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the servers or clusters that can be used for bootstrap into the specified bus.
*/
@Generated("with GenerateAdminCommands")
class ListAllSIBBootstrapMembersCmd extends AdminCmd<Void> {
    ListAllSIBBootstrapMembersCmd() {
        super("listAllSIBBootstrapMembers")
    }

    /**
     * Name of the bus to list the servers or clusters that can be used for bootstrap.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
