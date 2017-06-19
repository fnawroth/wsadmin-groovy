/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Check to see if a core group exists.
*/
@Generated("with GenerateAdminCommands")
class DoesCoreGroupExistCmd extends AdminCmd<Void> {
    DoesCoreGroupExistCmd() {
        super("doesCoreGroupExist")
    }

    /**
     * The name of the core group to check.
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

}
