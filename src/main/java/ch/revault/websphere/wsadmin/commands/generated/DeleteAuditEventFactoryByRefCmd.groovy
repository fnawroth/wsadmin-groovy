/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the audit event factory specified by the reference id.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditEventFactoryByRefCmd extends AdminCmd<Void> {
    DeleteAuditEventFactoryByRefCmd() {
        super("deleteAuditEventFactoryByRef")
    }

    /**
     * Supply a valid reference to an audit event factory implementation.
     */
    def 'eventFactoryRef'(String value) {
        parameter("eventFactoryRef", value)
    }

}
