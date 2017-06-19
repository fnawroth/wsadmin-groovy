/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to get the metadata associated with a jobType.
*/
@Generated("with GenerateAdminCommands")
class GetJobTypeMetadataCmd extends AdminCmd<Void> {
    GetJobTypeMetadataCmd() {
        super("getJobTypeMetadata")
    }

    /**
     * List containing Job Types.
     */
    def 'jobTypeList'(java.lang.String[] value) {
        parameter("jobTypeList", value)
    }

}
