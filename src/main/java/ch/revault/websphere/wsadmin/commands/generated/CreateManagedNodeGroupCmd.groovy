/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to create a group of managed nodes. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class CreateManagedNodeGroupCmd extends AdminCmd<Void> {
    CreateManagedNodeGroupCmd() {
        super("createManagedNodeGroup")
    }

    /**
     * The name of the group.
     */
    def 'groupName'(String value) {
        parameter("groupName", value)
    }

    /**
     * A brief description for the group.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
