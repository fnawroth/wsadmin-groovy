/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to create a group of targets.
*/
@Generated("with GenerateAdminCommands")
class CreateTargetGroupCmd extends AdminCmd<Void> {
    CreateTargetGroupCmd() {
        super("createTargetGroup")
    }

    /**
     * The name of the target group.
     */
    def 'groupName'(java.lang.String value) {
        parameter("groupName", value)
    }

    /**
     * A brief description for the target group.
     */
    def 'description'(java.lang.String value) {
        parameter("description", value)
    }

}
