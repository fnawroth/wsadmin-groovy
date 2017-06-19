/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an audit notification monitor specified by the unique name.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditNotificationMonitorByNameCmd extends AdminCmd<Void> {
    DeleteAuditNotificationMonitorByNameCmd() {
        super("deleteAuditNotificationMonitorByName")
    }

    /**
     * Supply a unique name for the audit notification monitor.
     */
    def 'monitorName'(String value) {
        parameter("monitorName", value)
    }

}
