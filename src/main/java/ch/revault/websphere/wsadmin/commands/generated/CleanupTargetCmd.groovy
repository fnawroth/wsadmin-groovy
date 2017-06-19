/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Cleanup a Target that no longer exists
*/
@Generated("with GenerateAdminCommands")
class CleanupTargetCmd extends AdminCmd<Void> {
    CleanupTargetCmd() {
        super("cleanupTarget")
    }

    /**
     * Name of the Target.
     */
    def 'targetName'(java.lang.String value) {
        parameter("targetName", value)
    }

}
