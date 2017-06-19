/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the audit event factory specified by the unique name.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditEventFactoryByNameCmd extends AdminCmd<Void> {
    DeleteAuditEventFactoryByNameCmd() {
        super("deleteAuditEventFactoryByName")
    }

    /**
     * Supply a unique name to identify the implementation.
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

}
