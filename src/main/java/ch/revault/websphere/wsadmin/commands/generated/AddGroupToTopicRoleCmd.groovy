/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Gives a group permission to access the topic for the specified role.
*/
@Generated("with GenerateAdminCommands")
class AddGroupToTopicRoleCmd extends AdminCmd<Void> {
    AddGroupToTopicRoleCmd() {
        super("addGroupToTopicRole")
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
     * Group name
     */
    def 'group'(String value) {
        parameter("group", value)
    }

    /**
     * The name that uniquely defines the user or group in the registry
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

}
