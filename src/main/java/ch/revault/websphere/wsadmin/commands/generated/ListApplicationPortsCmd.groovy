/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Displays a list of ports that is used to access the specified application, including the node name, server name, named endpoint, and host and port values.
*/
@Generated("with GenerateAdminCommands")
class ListApplicationPortsCmd extends AdminCmd<Void> {
    ListApplicationPortsCmd() {
        super("listApplicationPorts")
    }

}
