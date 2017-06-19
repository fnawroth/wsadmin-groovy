/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the option to send an audit notification email.
*/
@Generated("with GenerateAdminCommands")
class SetSendEmailCmd extends AdminCmd<Void> {
    SetSendEmailCmd() {
        super("setSendEmail")
    }

    /**
     * Supply the enablement flag (true/false).
     */
    def 'enable'(Boolean value) {
        parameter("enable", value)
    }

}
