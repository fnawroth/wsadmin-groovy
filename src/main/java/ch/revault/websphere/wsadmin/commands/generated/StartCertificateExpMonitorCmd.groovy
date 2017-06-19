/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Start the Certificate Expiration Monitor.
*/
@Generated("with GenerateAdminCommands")
class StartCertificateExpMonitorCmd extends AdminCmd<Void> {
    StartCertificateExpMonitorCmd() {
        super("startCertificateExpMonitor")
    }

    /**
     * Automatically save the changed key stores and configurations when the Certificate Expiration Monitor.
     */
    def 'ExpMonitorSaveConfig'(Boolean value) {
        parameter("ExpMonitorSaveConfig", value)
    }

}
