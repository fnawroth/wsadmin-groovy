/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to get the supported job types for a managed node.
*/
@Generated("with GenerateAdminCommands")
class GetJobTypesCmd extends AdminCmd<Void> {
    GetJobTypesCmd() {
        super("getJobTypes")
    }

    /**
     * List of managed node names for the target.
     */
    def 'targetList'(java.lang.String[] value) {
        parameter("targetList", value)
    }

    /**
     * The name of the group.
     */
    def 'group'(String value) {
        parameter("group", value)
    }

}
