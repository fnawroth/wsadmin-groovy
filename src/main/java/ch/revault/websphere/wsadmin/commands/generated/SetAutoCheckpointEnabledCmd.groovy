/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Enable or disable the automatic checkpoints  
*/
@Generated("with GenerateAdminCommands")
class SetAutoCheckpointEnabledCmd extends AdminCmd<Void> {
    SetAutoCheckpointEnabledCmd() {
        super("setAutoCheckpointEnabled")
    }

    /**
     * Enable the automatic checkpoints
     */
    def 'autoCheckpointEnabled'(Boolean value) {
        parameter("autoCheckpointEnabled", value)
    }

}
