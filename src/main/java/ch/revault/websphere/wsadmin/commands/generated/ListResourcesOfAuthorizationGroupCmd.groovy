/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all the resources within the given Authorization Group.
*/
@Generated("with GenerateAdminCommands")
class ListResourcesOfAuthorizationGroupCmd extends AdminCmd<Void> {
    ListResourcesOfAuthorizationGroupCmd() {
        super("listResourcesOfAuthorizationGroup")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

}
