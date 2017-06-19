/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a collection of node, server and transport channel chain combinations that are eligible to become bridge interfaces for the specified core group access point.
*/
@Generated("with GenerateAdminCommands")
class ListEligibleBridgeInterfacesCmd extends AdminCmd<Void> {
    ListEligibleBridgeInterfacesCmd() {
        super("listEligibleBridgeInterfaces")
    }

}
