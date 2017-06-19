/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Searches groups.
*/
@Generated("with GenerateAdminCommands")
class SearchGroupsCmd extends AdminCmd<Void> {
    SearchGroupsCmd() {
        super("searchGroups")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * A description of a group.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The common name of the entity.
     */
    def 'cn'(String value) {
        parameter("cn", value)
    }

    /**
     * A maximum amount of time, in milliseconds, to run a search.
     */
    def 'timeLimit'(Integer value) {
        parameter("timeLimit", value)
    }

    /**
     * The maximum number of entities to return.
     */
    def 'countLimit'(Integer value) {
        parameter("countLimit", value)
    }

    /**
     * The mode of clearing cache before the operation. Valid value is 'clearAll'.
     */
    def 'clearCache'(String value) {
        parameter("clearCache", value)
    }

}
