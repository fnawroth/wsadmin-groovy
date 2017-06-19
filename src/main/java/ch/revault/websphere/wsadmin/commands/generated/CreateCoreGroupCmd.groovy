/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new core group
*/
@Generated("with GenerateAdminCommands")
class CreateCoreGroupCmd extends AdminCmd<Void> {
    CreateCoreGroupCmd() {
        super("createCoreGroup")
    }

    /**
     * The name of the new core group to create
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

}
