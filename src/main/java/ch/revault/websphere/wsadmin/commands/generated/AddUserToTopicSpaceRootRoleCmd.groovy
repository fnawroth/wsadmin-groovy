/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Gives a user permission to access the topic space for the specified role.
*/
@Generated("with GenerateAdminCommands")
class AddUserToTopicSpaceRootRoleCmd extends AdminCmd<Void> {
    AddUserToTopicSpaceRootRoleCmd() {
        super("addUserToTopicSpaceRootRole")
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
     * The role name.  Allowable values are ( Sender | Receiver | IdentityAdopter )
     */
    def 'role'(String value) {
        parameter("role", value)
    }

    /**
     * User name
     */
    def 'user'(String value) {
        parameter("user", value)
    }

    /**
     * The name that uniquely defines the user or group in the registry
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

}
