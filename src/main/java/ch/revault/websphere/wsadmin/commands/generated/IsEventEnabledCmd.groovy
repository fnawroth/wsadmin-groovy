/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a Boolean indicating if the event has at least one audit outcome for which it has been enabled.
*/
@Generated("with GenerateAdminCommands")
class IsEventEnabledCmd extends AdminCmd<Void> {
    IsEventEnabledCmd() {
        super("isEventEnabled")
    }

    /**
     * Supply a valid event type.
     */
    def 'eventType'(String value) {
        parameter("eventType", value)
    }

}
