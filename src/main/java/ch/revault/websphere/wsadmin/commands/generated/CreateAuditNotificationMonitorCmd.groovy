/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures an audit notification monitor.
*/
@Generated("with GenerateAdminCommands")
class CreateAuditNotificationMonitorCmd extends AdminCmd<Void> {
    CreateAuditNotificationMonitorCmd() {
        super("createAuditNotificationMonitor")
    }

    /**
     * Supply a unique name for the audit notification monitor.
     */
    def 'monitorName'(String value) {
        parameter("monitorName", value)
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
