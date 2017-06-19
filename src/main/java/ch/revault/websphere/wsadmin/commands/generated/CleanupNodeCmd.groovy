/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* cleanupNodeDesc
*/
@Generated("with GenerateAdminCommands")
class CleanupNodeCmd extends AdminCmd<Void> {
    CleanupNodeCmd() {
        super("cleanupNode")
    }

    /**
     * cleanupNodeNodeNameDesc
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
