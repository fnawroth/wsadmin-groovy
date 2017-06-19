/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Map groupids to one or more admin role in the authorization group.
*/
@Generated("with GenerateAdminCommands")
class MapGroupsToAdminRoleCmd extends AdminCmd<Void> {
    MapGroupsToAdminRoleCmd() {
        super("mapGroupsToAdminRole")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

    /**
     * Name of the role.  < administrator | configurator | operator | deployer | monitor >
     */
    def 'roleName'(String value) {
        parameter("roleName", value)
    }

    /**
     * Group ID.
     */
    def 'groupids'(java.lang.String[] value) {
        parameter("groupids", value)
    }

    /**
     * Special Subject.  <EVERYONE | ALLAUTHENTICATED | ALLAUTHENTICATEDINTRUSTEDREALMS>
     */
    def 'specialSubjects'(java.lang.String[] value) {
        parameter("specialSubjects", value)
    }

    /**
     * ACCESS IDs. If provided, there should be one for each user id.
     */
    def 'accessids'(java.lang.String[] value) {
        parameter("accessids", value)
    }

}
