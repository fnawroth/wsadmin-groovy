/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Query for previously submitted jobs.
*/
@Generated("with GenerateAdminCommands")
class QueryJobsCmd extends AdminCmd<Void> {
    QueryJobsCmd() {
        super("queryJobs")
    }

    /**
     * String representation of the search query.
     */
    def 'query'(String value) {
        parameter("query", value)
    }

    /**
     * Maximum number of matches to return.
     */
    def 'maxReturn'(java.lang.Integer value) {
        parameter("maxReturn", value)
    }

}
