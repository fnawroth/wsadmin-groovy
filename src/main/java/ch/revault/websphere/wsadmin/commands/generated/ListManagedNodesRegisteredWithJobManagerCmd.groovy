/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List one registered managed node's data if a name is given, otherwise list all managed nodes registered with the job manager data
*/
@Generated("with GenerateAdminCommands")
class ListManagedNodesRegisteredWithJobManagerCmd extends AdminCmd<Void> {
    ListManagedNodesRegisteredWithJobManagerCmd() {
        super("listManagedNodesRegisteredWithJobManager")
    }

    /**
     * Name of the managed node by which JobManagers are looked up
     */
    def 'managedNodeName'(String value) {
        parameter("managedNodeName", value)
    }

}
