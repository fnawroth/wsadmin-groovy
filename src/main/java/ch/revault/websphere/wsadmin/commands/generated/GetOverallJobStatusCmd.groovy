/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to get overall status of a job.
*/
@Generated("with GenerateAdminCommands")
class GetOverallJobStatusCmd extends AdminCmd<Void> {
    GetOverallJobStatusCmd() {
        super("getOverallJobStatus")
    }

    /**
     * Unique identifiers of previously submitted jobs.
     */
    def 'jobTokenList'(java.lang.String[] value) {
        parameter("jobTokenList", value)
    }

}
