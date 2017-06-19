/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove resources from an existing authorization group.
*/
@Generated("with GenerateAdminCommands")
class RemoveResourceFromAuthorizationGroupCmd extends AdminCmd<Void> {
    RemoveResourceFromAuthorizationGroupCmd() {
        super("removeResourceFromAuthorizationGroup")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

    /**
     * Name of the resource
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

}
