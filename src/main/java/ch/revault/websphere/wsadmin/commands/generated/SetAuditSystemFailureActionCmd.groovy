/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the state of Security Auditing.
*/
@Generated("with GenerateAdminCommands")
class SetAuditSystemFailureActionCmd extends AdminCmd<Void> {
    SetAuditSystemFailureActionCmd() {
        super("setAuditSystemFailureAction")
    }

    /**
     * Supply the desired behavior when there is a failure in the Audit System. Valid inputs are: WARN, NOWARN, and FATAL
     */
    def 'action'(String value) {
        parameter("action", value)
    }

}
