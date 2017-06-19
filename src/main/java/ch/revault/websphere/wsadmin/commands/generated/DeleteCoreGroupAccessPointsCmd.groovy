/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete all the core group access points associated with a specified core group.
*/
@Generated("with GenerateAdminCommands")
class DeleteCoreGroupAccessPointsCmd extends AdminCmd<Void> {
    DeleteCoreGroupAccessPointsCmd() {
        super("deleteCoreGroupAccessPoints")
    }

    /**
     * Name of the Core group whose core group access points will be deleted.
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

}
