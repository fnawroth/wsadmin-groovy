/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of users in the specified security realm, security domain, or resource.
*/
@Generated("with GenerateAdminCommands")
class ListRegistryUsersCmd extends AdminCmd<Void> {
    ListRegistryUsersCmd() {
        super("listRegistryUsers")
    }

    /**
     * Specifies the name of the security realm for which a user list will be returned.
     */
    def 'securityRealmName'(String value) {
        parameter("securityRealmName", value)
    }

    /**
     * Specifies the name of the resource for which a user list will be returned.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

    /**
     * Specifies the name of the security domain for which a user list will be returned.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify true to return the list of user IDs and access IDs, and false just to return a list of user IDs.
     */
    def 'displayAccessIds'(Boolean value) {
        parameter("displayAccessIds", value)
    }

    /**
     * Specifies a filter to be used to get the list of users.
     */
    def 'userFilter'(String value) {
        parameter("userFilter", value)
    }

    /**
     * Specifies the maximum number of users to return.
     */
    def 'numberOfUsers'(Integer value) {
        parameter("numberOfUsers", value)
    }

}
