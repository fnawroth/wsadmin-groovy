/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the directory path where the checkpoints are stored
*/
@Generated("with GenerateAdminCommands")
class SetCheckpointLocationCmd extends AdminCmd<Void> {
    SetCheckpointLocationCmd() {
        super("setCheckpointLocation")
    }

    /**
     * The directory path where checkpoints are stored
     */
    def 'checkpointLocation'(String value) {
        parameter("checkpointLocation", value)
    }

}
