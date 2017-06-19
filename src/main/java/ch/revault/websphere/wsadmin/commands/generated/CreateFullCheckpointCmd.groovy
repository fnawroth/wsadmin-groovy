/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a full named checkpoint specified by the "checkpointName"
*/
@Generated("with GenerateAdminCommands")
class CreateFullCheckpointCmd extends AdminCmd<Void> {
    CreateFullCheckpointCmd() {
        super("createFullCheckpoint")
    }

    /**
     * Repository checkpoint name
     */
    def 'checkpointName'(String value) {
        parameter("checkpointName", value)
    }

    /**
     * The description of the new checkpoint 
     */
    def 'checkpointDesc'(String value) {
        parameter("checkpointDesc", value)
    }

}
