/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update information for a group of Targets.
*/
@Generated("with GenerateAdminCommands")
class ModifyTargetGroupInfoCmd extends AdminCmd<Void> {
    ModifyTargetGroupInfoCmd() {
        super("modifyTargetGroupInfo")
    }

    /**
     * The name of the target group.
     */
    def 'groupName'(java.lang.String value) {
        parameter("groupName", value)
    }

    /**
     * Description of the job.
     */
    def 'description'(java.lang.String value) {
        parameter("description", value)
    }

}
