/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Return a collection of core groups that are related to the specified core group. 
*/
@Generated("with GenerateAdminCommands")
class ListCoreGroupsCmd extends AdminCmd<Void> {
    ListCoreGroupsCmd() {
        super("listCoreGroups")
    }

    /**
     * Core group bridge settings object for the cell.
     */
    def 'cgBridgeSettings'(javax.management.ObjectName value) {
        parameter("cgBridgeSettings", value)
    }

}
