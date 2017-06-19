/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command creates a default core group access point for the specified core group and adds it to the default access point group.
*/
@Generated("with GenerateAdminCommands")
class CreateCoreGroupAccessPointCmd extends AdminCmd<Void> {
    CreateCoreGroupAccessPointCmd() {
        super("createCoreGroupAccessPoint")
    }

    /**
     * Name of the Core group for which the core group access point will be created.
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

}
