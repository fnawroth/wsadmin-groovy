/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* list all the group IDs in an AuthorizationGroups
*/
@Generated("with GenerateAdminCommands")
class ListAuditGroupIDsOfAuthorizationGroupCmd extends AdminCmd<Void> {
    ListAuditGroupIDsOfAuthorizationGroupCmd() {
        super("listAuditGroupIDsOfAuthorizationGroup")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

}
