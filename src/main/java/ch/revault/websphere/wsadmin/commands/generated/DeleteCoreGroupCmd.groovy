/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing core group. The core group must contain no servers.
*/
@Generated("with GenerateAdminCommands")
class DeleteCoreGroupCmd extends AdminCmd<Void> {
    DeleteCoreGroupCmd() {
        super("deleteCoreGroup")
    }

    /**
     * The name of the core group to delete.
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

}
