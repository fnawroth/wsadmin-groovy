/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an audit emitter implementation object by unique name.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditEmitterByNameCmd extends AdminCmd<Void> {
    DeleteAuditEmitterByNameCmd() {
        super("deleteAuditEmitterByName")
    }

    /**
     * Supply a unique name to identify the implementation.
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

}
