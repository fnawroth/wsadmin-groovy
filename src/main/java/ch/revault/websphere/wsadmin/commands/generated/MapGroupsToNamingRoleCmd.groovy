/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Map groups or special subjects or both to the naming roles
*/
@Generated("with GenerateAdminCommands")
class MapGroupsToNamingRoleCmd extends AdminCmd<Void> {
    MapGroupsToNamingRoleCmd() {
        super("mapGroupsToNamingRole")
    }

    /**
     * Name of the Naming role: <CosNamingRead | CosNamingWrite | CosNamingCreate | CosNamingDelete>
     */
    def 'roleName'(String value) {
        parameter("roleName", value)
    }

    /**
     * Group names
	To add multiple values use space separated names enclosed by quotes(" ")
	Example: -groupids "group1 group2"
     */
    def 'groupids'(java.lang.String[] value) {
        parameter("groupids", value)
    }

    /**
     * AccessIds of the groups <group:realmName/uniqueID>
	To add multiple values use space separated names enclosed by quotes(" "). The order of the accessids list should match accordingly with the order of the groupids list.
	Example: "group:default/123 group:default/456"
     */
    def 'accessids'(java.lang.String[] value) {
        parameter("accessids", value)
    }

    /**
     * Special subjects <EVERYONE | ALLAUTHENTICATED | ALLAUTHENTICATEDINTRUSTEDREALMS>
	To add multiple values use space separated names enclosed by quotes(" ")
	Example: -specialSubjects "ALLAUTHENTICATED EVERYONE"
     */
    def 'specialSubjects'(java.lang.String[] value) {
        parameter("specialSubjects", value)
    }

}
