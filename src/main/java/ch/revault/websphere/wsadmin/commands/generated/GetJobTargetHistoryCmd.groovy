/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to get the job target history for a job.
*/
@Generated("with GenerateAdminCommands")
class GetJobTargetHistoryCmd extends AdminCmd<Void> {
    GetJobTargetHistoryCmd() {
        super("getJobTargetHistory")
    }

    /**
     * Unique identifier of previously submitted job.
     */
    def 'jobToken'(String value) {
        parameter("jobToken", value)
    }

    /**
     * Managed node name for the target.
     */
    def 'target'(String value) {
        parameter("target", value)
    }

    /**
     * Include all the time window starting with the specified time.
     */
    def 'startingTime'(java.lang.String value) {
        parameter("startingTime", value)
    }

    /**
     * Include all the time window ending with the specified time.
     */
    def 'endingTime'(java.lang.String value) {
        parameter("endingTime", value)
    }

    /**
     * Returns the results in ascending order if set to true.
     */
    def 'ascending'(Boolean value) {
        parameter("ascending", value)
    }

    /**
     * Maximum number of matches to return.
     */
    def 'maxReturn'(java.lang.Integer value) {
        parameter("maxReturn", value)
    }

}
