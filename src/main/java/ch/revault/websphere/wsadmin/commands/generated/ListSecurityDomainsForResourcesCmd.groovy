/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of resources and their associated domain for each resource provided.
*/
@Generated("with GenerateAdminCommands")
class ListSecurityDomainsForResourcesCmd extends AdminCmd<Void> {
    ListSecurityDomainsForResourcesCmd() {
        super("listSecurityDomainsForResources")
    }

    /**
     * A plus separated list of resource names for which domain name are to be provided.
     */
    def 'resourceNames'(String value) {
        parameter("resourceNames", value)
    }

}
