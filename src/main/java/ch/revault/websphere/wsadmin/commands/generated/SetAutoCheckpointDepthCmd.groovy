/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the automatic checkpoints depth value
*/
@Generated("with GenerateAdminCommands")
class SetAutoCheckpointDepthCmd extends AdminCmd<Void> {
    SetAutoCheckpointDepthCmd() {
        super("setAutoCheckpointDepth")
    }

    /**
     * The depth of the automatic checkpoints
     */
    def 'autoCheckpointDepth'(Integer value) {
        parameter("autoCheckpointDepth", value)
    }

}
