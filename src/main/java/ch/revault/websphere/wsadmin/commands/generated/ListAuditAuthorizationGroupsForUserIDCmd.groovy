/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* list all the AuthorizationGroups that a given user has access to.
*/
@Generated("with GenerateAdminCommands")
class ListAuditAuthorizationGroupsForUserIDCmd extends AdminCmd<Void> {
    ListAuditAuthorizationGroupsForUserIDCmd() {
        super("listAuditAuthorizationGroupsForUserID")
    }

    /**
     * User ID.
     */
    def 'userid'(String value) {
        parameter("userid", value)
    }

}
