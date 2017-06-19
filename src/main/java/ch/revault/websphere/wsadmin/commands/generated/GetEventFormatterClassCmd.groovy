/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the class name of the event formatter associated with the audit service provider reference.
*/
@Generated("with GenerateAdminCommands")
class GetEventFormatterClassCmd extends AdminCmd<Void> {
    GetEventFormatterClassCmd() {
        super("getEventFormatterClass")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

}
