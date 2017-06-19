/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Specifies the certificate expiration monitor name.
*/
@Generated("with GenerateAdminCommands")
class DeleteWSCertExpMonitorCmd extends AdminCmd<Void> {
    DeleteWSCertExpMonitorCmd() {
        super("deleteWSCertExpMonitor")
    }

    /**
     * Specifies the certificate expiration monitor name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
