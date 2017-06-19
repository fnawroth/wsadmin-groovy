/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the roles defined for a specified user.
*/
@Generated("with GenerateAdminCommands")
class ListAllRolesForUserCmd extends AdminCmd<Void> {
    ListAllRolesForUserCmd() {
        super("listAllRolesForUser")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * User name
     */
    def 'user'(String value) {
        parameter("user", value)
    }

    /**
     * When set to true the result will be formatted in the advanced format. The enhanced format includes the config object type, the role, the bus or topic name, and the destination name separated by colons.
     */
    def 'enhancedOutput'(Boolean value) {
        parameter("enhancedOutput", value)
    }

}
