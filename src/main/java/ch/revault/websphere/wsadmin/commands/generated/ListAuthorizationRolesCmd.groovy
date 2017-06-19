/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* listAuthorizationRolesDesc
*/
@Generated("with GenerateAdminCommands")
class ListAuthorizationRolesCmd extends AdminCmd<Void> {
    ListAuthorizationRolesCmd() {
        super("listAuthorizationRoles")
    }

    /**
     * roleTypeDesc
     */
    def 'roleType'(String value) {
        parameter("roleType", value)
    }

}
