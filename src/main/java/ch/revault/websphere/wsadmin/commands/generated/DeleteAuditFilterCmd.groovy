/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an audit specification entry in the audit.xml that matches the event and outcome.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditFilterCmd extends AdminCmd<Void> {
    DeleteAuditFilterCmd() {
        super("deleteAuditFilter")
    }

    /**
     * Supply a valid event type.
     */
    def 'eventType'(String value) {
        parameter("eventType", value)
    }

    /**
     * Supply a valid audit outcome.
     */
    def 'outcome'(String value) {
        parameter("outcome", value)
    }

}
