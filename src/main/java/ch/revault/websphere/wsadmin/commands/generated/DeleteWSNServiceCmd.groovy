/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a WS-Notification service
*/
@Generated("with GenerateAdminCommands")
class DeleteWSNServiceCmd extends AdminCmd<Void> {
    DeleteWSNServiceCmd() {
        super("deleteWSNService")
    }

    /**
     * Indicates whether service integration bus topic spaces created by definition of a WSNTopicNamespace should also be deleted (default is False).
     */
    def 'deleteSIBTopicSpaces'(Boolean value) {
        parameter("deleteSIBTopicSpaces", value)
    }

}
