/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures an audit notification.
*/
@Generated("with GenerateAdminCommands")
class CreateAuditNotificationCmd extends AdminCmd<Void> {
    CreateAuditNotificationCmd() {
        super("createAuditNotification")
    }

    /**
     * Supply a unique name for the audit notification.
     */
    def 'notificationName'(String value) {
        parameter("notificationName", value)
    }

    /**
     * Flag indicating if notification is logged to system out.
     */
    def 'logToSystemOut'(Boolean value) {
        parameter("logToSystemOut", value)
    }

    /**
     * Flag indicating if notification is emailed.
     */
    def 'sendEmail'(Boolean value) {
        parameter("sendEmail", value)
    }

    /**
     * Supply an email list or distribution email list to which to send audit notifications.
     */
    def 'emailList'(String value) {
        parameter("emailList", value)
    }

    /**
     * Specify html to email the content in html format or specify text to send it in text format.
     */
    def 'emailFormat'(String value) {
        parameter("emailFormat", value)
    }

}
