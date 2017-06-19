/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add an instance document to a WS-Notification topic namespace
*/
@Generated("with GenerateAdminCommands")
class CreateWSNTopicDocumentCmd extends AdminCmd<Void> {
    CreateWSNTopicDocumentCmd() {
        super("createWSNTopicDocument")
    }

    /**
     * URL of instance document
     */
    def 'url'(String value) {
        parameter("url", value)
    }

    /**
     * Description of the instance document
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
