/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Unregister a host from the job manager.
*/
@Generated("with GenerateAdminCommands")
class UnregisterHostCmd extends AdminCmd<Void> {
    UnregisterHostCmd() {
        super("unregisterHost")
    }

    /**
     * Name of the host to unregister.
     */
    def 'host'(java.lang.String value) {
        parameter("host", value)
    }

}
