/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Disables the Audit Specification.
*/
@Generated("with GenerateAdminCommands")
class DisableAuditFilterCmd extends AdminCmd<Void> {
    DisableAuditFilterCmd() {
        super("disableAuditFilter")
    }

    /**
     * Supply a valid audit specification reference.
     */
    def 'filterRef'(String value) {
        parameter("filterRef", value)
    }

}
