/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all foreign buses which have roles defined on them for the specified bus.
*/
@Generated("with GenerateAdminCommands")
class ListAllForeignBusesWithRolesCmd extends AdminCmd<Void> {
    ListAllForeignBusesWithRolesCmd() {
        super("listAllForeignBusesWithRoles")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
