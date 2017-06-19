/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show the properties of a WSNTopicDocument in a human readable form.
*/
@Generated("with GenerateAdminCommands")
class ShowWSNTopicDocumentCmd extends AdminCmd<Void> {
    ShowWSNTopicDocumentCmd() {
        super("showWSNTopicDocument")
    }

    /**
     * URL
     */
    def 'url'(String value) {
        parameter("url", value)
    }

}
