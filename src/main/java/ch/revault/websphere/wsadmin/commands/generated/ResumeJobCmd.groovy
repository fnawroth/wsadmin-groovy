/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Resumes a previously submitted job.
*/
@Generated("with GenerateAdminCommands")
class ResumeJobCmd extends AdminCmd<Void> {
    ResumeJobCmd() {
        super("resumeJob")
    }

    /**
     * Unique identifier of previously submitted job.
     */
    def 'jobToken'(String value) {
        parameter("jobToken", value)
    }

}
