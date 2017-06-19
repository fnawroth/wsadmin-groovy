/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns an audit specification entry in the audit.xml that matches the reference Id.
*/
@Generated("with GenerateAdminCommands")
class GetAuditFilterCmd extends AdminCmd<Void> {
    GetAuditFilterCmd() {
        super("getAuditFilter")
    }

    /**
     * Supply a valid audit specification reference.
     */
    def 'filterRef'(String value) {
        parameter("filterRef", value)
    }

}
