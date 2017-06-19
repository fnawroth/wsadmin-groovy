/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get property keys associated with an specific managed resource.
*/
@Generated("with GenerateAdminCommands")
class GetManagedResourcePropertyKeysCmd extends AdminCmd<Void> {
    GetManagedResourcePropertyKeysCmd() {
        super("getManagedResourcePropertyKeys")
    }

    /**
     * Type of resource on which to query.
     */
    def 'resourceType'(java.lang.String value) {
        parameter("resourceType", value)
    }

}
