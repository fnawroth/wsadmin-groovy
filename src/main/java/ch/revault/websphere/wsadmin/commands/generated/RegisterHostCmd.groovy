/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Registers a host with the job manager.
*/
@Generated("with GenerateAdminCommands")
class RegisterHostCmd extends AdminCmd<Void> {
    RegisterHostCmd() {
        super("registerHost")
    }

    /**
     * Name of the host to unregister.
     */
    def 'host'(java.lang.String value) {
        parameter("host", value)
    }

    /**
     * Properties of the host.
     */
    def 'hostProps'(java.util.Properties value) {
        parameter("hostProps", value)
    }

}
