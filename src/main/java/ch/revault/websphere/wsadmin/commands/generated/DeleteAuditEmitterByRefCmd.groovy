/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an audit emitter implementation object by reference id.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditEmitterByRefCmd extends AdminCmd<Void> {
    DeleteAuditEmitterByRefCmd() {
        super("deleteAuditEmitterByRef")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

}
