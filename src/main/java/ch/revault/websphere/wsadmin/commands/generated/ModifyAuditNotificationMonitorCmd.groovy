/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the audit notification monitor specified by the reference id.
*/
@Generated("with GenerateAdminCommands")
class ModifyAuditNotificationMonitorCmd extends AdminCmd<Void> {
    ModifyAuditNotificationMonitorCmd() {
        super("modifyAuditNotificationMonitor")
    }

    /**
     * Supply a reference id for the audit notification monitor.
     */
    def 'monitorRef'(String value) {
        parameter("monitorRef", value)
    }

    /**
     * Supply a reference to an existing audit notification.
     */
    def 'notificationRef'(String value) {
        parameter("notificationRef", value)
    }

    /**
     * Supply the enablement flag (true/false).
     */
    def 'enable'(Boolean value) {
        parameter("enable", value)
    }

}
