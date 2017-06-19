/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get properties associated with a specific managed resource.
*/
@Generated("with GenerateAdminCommands")
class GetManagedResourcePropertiesCmd extends AdminCmd<Void> {
    GetManagedResourcePropertiesCmd() {
        super("getManagedResourceProperties")
    }

    /**
     * List of identifiers associated with the resource.
     */
    def 'resourceIdList'(java.lang.String[] value) {
        parameter("resourceIdList", value)
    }

}
