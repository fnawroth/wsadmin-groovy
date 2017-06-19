/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the default outbound port for an outbound service.
*/
@Generated("with GenerateAdminCommands")
class SetDefaultSIBWSOutboundPortCmd extends AdminCmd<Void> {
    SetDefaultSIBWSOutboundPortCmd() {
        super("setDefaultSIBWSOutboundPort")
    }

    /**
     * Name of the outbound port to be set as the default.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
