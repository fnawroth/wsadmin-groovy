/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a certificate expiration monitor.
*/
@Generated("with GenerateAdminCommands")
class ModifyWSCertExpMonitorCmd extends AdminCmd<Void> {
    ModifyWSCertExpMonitorCmd() {
        super("modifyWSCertExpMonitor")
    }

    /**
     * Specifies the certificate expiration monitor name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specify true to automatically replace certificate during expiration monitoring, false otherwise.
     */
    def 'autoReplace'(Boolean value) {
        parameter("autoReplace", value)
    }

    /**
     * Specify true to delete old certificates during expiration monitoring, false to not delete old certificates.
     */
    def 'deleteOld'(Boolean value) {
        parameter("deleteOld", value)
    }

    /**
     * Specify the number of days to issue a warning about certificate expiration.
     */
    def 'daysBeforeNotification'(Integer value) {
        parameter("daysBeforeNotification", value)
    }

    /**
     * Specifies the name of the schedule used to run certificate expiration monitoring.
     */
    def 'wsScheduleName'(String value) {
        parameter("wsScheduleName", value)
    }

    /**
     * Specifies the name of the notification to use during expiration monitoring.
     */
    def 'wsNotificationName'(String value) {
        parameter("wsNotificationName", value)
    }

    /**
     * Specify true to enable the certificate expiration monitor, false to disable the certificate expiration monitor.
     */
    def 'isEnabled'(Boolean value) {
        parameter("isEnabled", value)
    }

}
