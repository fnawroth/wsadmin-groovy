/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an audit notification monitor specified by the reference id.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditNotificationMonitorByRefCmd extends AdminCmd<Void> {
    DeleteAuditNotificationMonitorByRefCmd() {
        super("deleteAuditNotificationMonitorByRef")
    }

    /**
     * Supply a reference id for the audit notification monitor.
     */
    def 'monitorRef'(String value) {
        parameter("monitorRef", value)
    }

}
