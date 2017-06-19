/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove groups or special subjects or both from a naming role
*/
@Generated("with GenerateAdminCommands")
class RemoveGroupsFromNamingRoleCmd extends AdminCmd<Void> {
    RemoveGroupsFromNamingRoleCmd() {
        super("removeGroupsFromNamingRole")
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
     * Special subjects <EVERYONE | ALLAUTHENTICATED | ALLAUTHENTICATEDINTRUSTEDREALMS>
	To add multiple values use space separated names enclosed by quotes(" ")
	Example: -specialSubjects "ALLAUTHENTICATED EVERYONE"
     */
    def 'specialSubjects'(java.lang.String[] value) {
        parameter("specialSubjects", value)
    }

}
