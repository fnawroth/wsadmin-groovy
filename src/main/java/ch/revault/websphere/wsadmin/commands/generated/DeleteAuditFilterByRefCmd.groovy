/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an audit specification entry in the audit.xml that matches the reference Id.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditFilterByRefCmd extends AdminCmd<Void> {
    DeleteAuditFilterByRefCmd() {
        super("deleteAuditFilterByRef")
    }

    /**
     * Supply a valid audit specification reference.
     */
    def 'filterRef'(String value) {
        parameter("filterRef", value)
    }

}
