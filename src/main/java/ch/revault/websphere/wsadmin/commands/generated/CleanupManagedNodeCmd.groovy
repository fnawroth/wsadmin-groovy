/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Cleanup a managed node that no longer exists
*/
@Generated("with GenerateAdminCommands")
class CleanupManagedNodeCmd extends AdminCmd<Void> {
    CleanupManagedNodeCmd() {
        super("cleanupManagedNode")
    }

    /**
     * Name of the managed node.
     */
    def 'managedNodeName'(java.lang.String value) {
        parameter("managedNodeName", value)
    }

}
