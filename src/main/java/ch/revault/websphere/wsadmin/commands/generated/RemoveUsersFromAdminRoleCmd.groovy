/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove userids from one or more admin role in the AuthorizationGroup.
*/
@Generated("with GenerateAdminCommands")
class RemoveUsersFromAdminRoleCmd extends AdminCmd<Void> {
    RemoveUsersFromAdminRoleCmd() {
        super("removeUsersFromAdminRole")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

    /**
     * Name of the role.  < administrator | configurator | operator | deployer | monitor >
     */
    def 'roleName'(String value) {
        parameter("roleName", value)
    }

    /**
     * User ID.
     */
    def 'userids'(java.lang.String[] value) {
        parameter("userids", value)
    }

}
