/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all the objects that a given user has access to.
*/
@Generated("with GenerateAdminCommands")
class ListAuditResourcesForUserIDCmd extends AdminCmd<Void> {
    ListAuditResourcesForUserIDCmd() {
        super("listAuditResourcesForUserID")
    }

    /**
     * User ID.
     */
    def 'userid'(String value) {
        parameter("userid", value)
    }

}
