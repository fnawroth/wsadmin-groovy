/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a WS-Notification topic namespace
*/
@Generated("with GenerateAdminCommands")
class DeleteWSNTopicNamespaceCmd extends AdminCmd<Void> {
    DeleteWSNTopicNamespaceCmd() {
        super("deleteWSNTopicNamespace")
    }

    /**
     * Indicates whether service integration bus topic space created by definition of a WSNTopicNamespace should also be deleted.
     */
    def 'deleteSIBTopicSpace'(Boolean value) {
        parameter("deleteSIBTopicSpace", value)
    }

}
