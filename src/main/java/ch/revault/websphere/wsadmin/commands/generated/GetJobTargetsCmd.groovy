/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to get targets for a job.  The targets for the job may have been unregistered, or deleted.
*/
@Generated("with GenerateAdminCommands")
class GetJobTargetsCmd extends AdminCmd<Void> {
    GetJobTargetsCmd() {
        super("getJobTargets")
    }

    /**
     * Unique identifier of previously submitted job.
     */
    def 'jobToken'(String value) {
        parameter("jobToken", value)
    }

}
