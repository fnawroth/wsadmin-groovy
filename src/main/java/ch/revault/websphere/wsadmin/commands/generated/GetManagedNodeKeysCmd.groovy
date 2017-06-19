/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get properties keys associated with a specific managed node. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class GetManagedNodeKeysCmd extends AdminCmd<Void> {
    GetManagedNodeKeysCmd() {
        super("getManagedNodeKeys")
    }

    /**
     * Name of the managed node.
     */
    def 'managedNodeName'(java.lang.String value) {
        parameter("managedNodeName", value)
    }

}
