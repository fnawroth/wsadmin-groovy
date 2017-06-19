/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a notifier.
*/
@Generated("with GenerateAdminCommands")
class ModifyWSNotifierCmd extends AdminCmd<Void> {
    ModifyWSNotifierCmd() {
        super("modifyWSNotifier")
    }

    /**
     * Specifies the name that uniquely identifies a notifier.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specify true to log information to system out, false otherwise.
     */
    def 'logToSystemOut'(Boolean value) {
        parameter("logToSystemOut", value)
    }

    /**
     * Specify true to send notifiers an e-mail, false to not send an email.
     */
    def 'sendEmail'(Boolean value) {
        parameter("sendEmail", value)
    }

    /**
     * Specifies a colon separated list of email address to send notification.
     */
    def 'emailList'(String value) {
        parameter("emailList", value)
    }

}
