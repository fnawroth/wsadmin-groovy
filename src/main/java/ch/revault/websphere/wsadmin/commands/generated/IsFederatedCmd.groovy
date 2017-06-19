/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Check if the server is a standalone server or the node of the given server is federated with a deployment manager. Returns "true" if the node of the server is federated, "false" otherwise.
*/
@Generated("with GenerateAdminCommands")
class IsFederatedCmd extends AdminCmd<Void> {
    IsFederatedCmd() {
        super("isFederated")
    }

}
