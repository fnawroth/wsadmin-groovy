/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing authorization group
*/
@Generated("with GenerateAdminCommands")
class DeleteAuthorizationGroupCmd extends AdminCmd<Void> {
    DeleteAuthorizationGroupCmd() {
        super("deleteAuthorizationGroup")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

}
