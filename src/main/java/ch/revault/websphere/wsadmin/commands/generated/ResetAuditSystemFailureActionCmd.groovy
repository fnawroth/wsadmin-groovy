/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Resets the audit system failure policy to the default, NOWARN.
*/
@Generated("with GenerateAdminCommands")
class ResetAuditSystemFailureActionCmd extends AdminCmd<Void> {
    ResetAuditSystemFailureActionCmd() {
        super("resetAuditSystemFailureAction")
    }

}
