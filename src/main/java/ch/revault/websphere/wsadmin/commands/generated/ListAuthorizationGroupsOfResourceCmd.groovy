/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the authorization groups of a given Resource.
*/
@Generated("with GenerateAdminCommands")
class ListAuthorizationGroupsOfResourceCmd extends AdminCmd<Void> {
    ListAuthorizationGroupsOfResourceCmd() {
        super("listAuthorizationGroupsOfResource")
    }

    /**
     * Name of the resource
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

    /**
     * If traverseContainingObjects is true, it will list all the Resources that are effectively within this authorization group. If traverseContainingObjects is false, it will list only the resources within the given Authorization Group.
     */
    def 'traverseContainedResources'(Boolean value) {
        parameter("traverseContainedResources", value)
    }

}
