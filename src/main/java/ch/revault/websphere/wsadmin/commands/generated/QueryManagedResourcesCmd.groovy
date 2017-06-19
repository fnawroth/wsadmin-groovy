/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Queries for all managed resources.
*/
@Generated("with GenerateAdminCommands")
class QueryManagedResourcesCmd extends AdminCmd<Void> {
    QueryManagedResourcesCmd() {
        super("queryManagedResources")
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
