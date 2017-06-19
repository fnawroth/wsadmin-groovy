/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Information regarding a group of Targets.
*/
@Generated("with GenerateAdminCommands")
class GetTargetGroupInfoCmd extends AdminCmd<Void> {
    GetTargetGroupInfoCmd() {
        super("getTargetGroupInfo")
    }

    /**
     * A list of target group names.
     */
    def 'groupName'(java.lang.String[] value) {
        parameter("groupName", value)
    }

}
