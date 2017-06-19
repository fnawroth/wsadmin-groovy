/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use this command to list all registered managed nodes in the admin agent, or to list all federated nodes in the deployment manager.
*/
@Generated("with GenerateAdminCommands")
class ListManagedNodesCmd extends AdminCmd<Void> {
    ListManagedNodesCmd() {
        super("listManagedNodes")
    }

}
