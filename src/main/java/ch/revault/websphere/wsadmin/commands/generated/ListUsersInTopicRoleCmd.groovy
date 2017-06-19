/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the users in the specified topic role for the specified topic space.
*/
@Generated("with GenerateAdminCommands")
class ListUsersInTopicRoleCmd extends AdminCmd<Void> {
    ListUsersInTopicRoleCmd() {
        super("listUsersInTopicRole")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Topicspace name
     */
    def 'topicSpace'(String value) {
        parameter("topicSpace", value)
    }

    /**
     * Topic name
     */
    def 'topic'(String value) {
        parameter("topic", value)
    }

    /**
     * The role name.  Allowable values are ( Sender | Receiver | IdentityAdopter )
     */
    def 'role'(String value) {
        parameter("role", value)
    }

    /**
     * SHOW_UNIQUE_NAMES_DESCRIPTION
     */
    def 'showUniqueNames'(Boolean value) {
        parameter("showUniqueNames", value)
    }

}
