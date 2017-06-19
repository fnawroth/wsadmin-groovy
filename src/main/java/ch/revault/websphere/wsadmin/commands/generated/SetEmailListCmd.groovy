/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the notification email list for the configured audit notification.
*/
@Generated("with GenerateAdminCommands")
class SetEmailListCmd extends AdminCmd<Void> {
    SetEmailListCmd() {
        super("setEmailList")
    }

    /**
     * Supply an email list or distribution email list to which to send audit notifications.
     */
    def 'emailList'(String value) {
        parameter("emailList", value)
    }

}
