/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove all default roles
*/
@Generated("with GenerateAdminCommands")
class RemoveDefaultRolesCmd extends AdminCmd<Void> {
    RemoveDefaultRolesCmd() {
        super("removeDefaultRoles")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

}
