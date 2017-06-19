/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the WSNTopicDocument objects in the configuration of the target WSNTopicNamespace that match the specified input parameters.
*/
@Generated("with GenerateAdminCommands")
class ListWSNTopicDocumentsCmd extends AdminCmd<Void> {
    ListWSNTopicDocumentsCmd() {
        super("listWSNTopicDocuments")
    }

    /**
     * URL
     */
    def 'url'(String value) {
        parameter("url", value)
    }

}
