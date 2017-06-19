/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete the named checkpoint specified by the "checkpointName"
*/
@Generated("with GenerateAdminCommands")
class DeleteCheckpointCmd extends AdminCmd<Void> {
    DeleteCheckpointCmd() {
        super("deleteCheckpoint")
    }

    /**
     * Repository checkpoint name
     */
    def 'checkpointName'(String value) {
        parameter("checkpointName", value)
    }

}
