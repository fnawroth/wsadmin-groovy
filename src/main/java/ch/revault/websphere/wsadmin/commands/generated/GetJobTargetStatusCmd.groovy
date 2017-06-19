/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to get the latest job target status for a job.
*/
@Generated("with GenerateAdminCommands")
class GetJobTargetStatusCmd extends AdminCmd<Void> {
    GetJobTargetStatusCmd() {
        super("getJobTargetStatus")
    }

    /**
     * Unique identifier of previously submitted job.
     */
    def 'jobToken'(String value) {
        parameter("jobToken", value)
    }

    /**
     * List of managed node names for the target.
     */
    def 'targetList'(java.lang.String[] value) {
        parameter("targetList", value)
    }

}
