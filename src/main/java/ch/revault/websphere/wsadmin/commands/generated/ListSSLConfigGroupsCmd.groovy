/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all SSL configuration groups.
*/
@Generated("with GenerateAdminCommands")
class ListSSLConfigGroupsCmd extends AdminCmd<Void> {
    ListSSLConfigGroupsCmd() {
        super("listSSLConfigGroups")
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Direction for this SSL configuration group, inbound or outbound.
     */
    def 'direction'(String value) {
        parameter("direction", value)
    }

    /**
     * Specify true to display the list output as ObjectNames and false to return SSL configuration alias names.
     */
    def 'displayObjectName'(Boolean value) {
        parameter("displayObjectName", value)
    }

    /**
     * Specify true to list all SSL configuration groups.  True overrides the scopeName parameter.
     */
    def 'all'(Boolean value) {
        parameter("all", value)
    }

}
