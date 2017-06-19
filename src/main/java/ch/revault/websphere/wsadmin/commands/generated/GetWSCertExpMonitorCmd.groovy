/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get information about a certificate expiration monitor.
*/
@Generated("with GenerateAdminCommands")
class GetWSCertExpMonitorCmd extends AdminCmd<Void> {
    GetWSCertExpMonitorCmd() {
        super("getWSCertExpMonitor")
    }

    /**
     * Specifies the certificate expiration monitor name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
