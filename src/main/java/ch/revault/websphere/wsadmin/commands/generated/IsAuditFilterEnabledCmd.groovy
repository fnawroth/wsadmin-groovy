/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Determination of enablement state of an Audit Specification.
*/
@Generated("with GenerateAdminCommands")
class IsAuditFilterEnabledCmd extends AdminCmd<Void> {
    IsAuditFilterEnabledCmd() {
        super("isAuditFilterEnabled")
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
