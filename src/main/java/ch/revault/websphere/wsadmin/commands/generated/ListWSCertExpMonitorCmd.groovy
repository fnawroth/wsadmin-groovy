/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all certificate expiration monitors.
*/
@Generated("with GenerateAdminCommands")
class ListWSCertExpMonitorCmd extends AdminCmd<Void> {
    ListWSCertExpMonitorCmd() {
        super("listWSCertExpMonitor")
    }

    /**
     * Specify true to display the list output as ObjectNames and false to return SSL configuration alias names.
     */
    def 'displayObjectName'(Boolean value) {
        parameter("displayObjectName", value)
    }

}
