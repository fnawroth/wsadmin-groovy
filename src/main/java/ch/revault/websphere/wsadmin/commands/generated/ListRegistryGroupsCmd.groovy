/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of groups in a security realm, security domain, or resource.
*/
@Generated("with GenerateAdminCommands")
class ListRegistryGroupsCmd extends AdminCmd<Void> {
    ListRegistryGroupsCmd() {
        super("listRegistryGroups")
    }

    /**
     * Specifies the name of the security realm for which a group list will be returned.
     */
    def 'securityRealmName'(String value) {
        parameter("securityRealmName", value)
    }

    /**
     * Specifies the name of the resource for which a group list will be returned.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

    /**
     * Specifies the name of the security domain for which a group list will be returned.
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
     * Specify a filter to be used to get the list of groups.
     */
    def 'groupFilter'(String value) {
        parameter("groupFilter", value)
    }

    /**
     * Specifies the maximum number of groups to return.
     */
    def 'numberOfGroups'(Integer value) {
        parameter("numberOfGroups", value)
    }

}
