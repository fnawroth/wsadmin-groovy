/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get properties associated with a specific managed node. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class GetManagedNodePropertiesCmd extends AdminCmd<Void> {
    GetManagedNodePropertiesCmd() {
        super("getManagedNodeProperties")
    }

    /**
     * List of managed node names.
     */
    def 'managedNodeNameList'(java.lang.String[] value) {
        parameter("managedNodeNameList", value)
    }

}
