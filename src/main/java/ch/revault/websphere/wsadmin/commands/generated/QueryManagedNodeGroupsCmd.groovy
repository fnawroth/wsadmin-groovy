/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command is used to query groups of Managed Nodes. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class QueryManagedNodeGroupsCmd extends AdminCmd<Void> {
    QueryManagedNodeGroupsCmd() {
        super("queryManagedNodeGroups")
    }

    /**
     * String representation of the search query.
     */
    def 'query'(java.lang.String value) {
        parameter("query", value)
    }

    /**
     * Maximum size of data retrieved.
     */
    def 'maxReturn'(java.lang.Integer value) {
        parameter("maxReturn", value)
    }

    /**
     * Validate query string.
     */
    def 'validate'(Boolean value) {
        parameter("validate", value)
    }

}
