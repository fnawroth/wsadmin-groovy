/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "deleteLMServiceEventPoint" command to delete a local mapping service event point.
*/
@Generated("with GenerateAdminCommands")
class DeleteLMServiceEventPointCmd extends AdminCmd<Void> {
    DeleteLMServiceEventPointCmd() {
        super("deleteLMServiceEventPoint")
    }

    /**
     * The name of the local mapping service with the event point.
     */
    def 'lmService'(String value) {
        parameter("lmService", value)
    }

}
