/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the audit outcomes defined for an event.
*/
@Generated("with GenerateAdminCommands")
class GetAuditOutcomesCmd extends AdminCmd<Void> {
    GetAuditOutcomesCmd() {
        super("getAuditOutcomes")
    }

    /**
     * Supply a valid event type.
     */
    def 'eventType'(String value) {
        parameter("eventType", value)
    }

}
