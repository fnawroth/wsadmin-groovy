/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all resources mapped to the specified security domain.
*/
@Generated("with GenerateAdminCommands")
class ListResourcesInSecurityDomainCmd extends AdminCmd<Void> {
    ListResourcesInSecurityDomainCmd() {
        super("listResourcesInSecurityDomain")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify true to expand a cell resource to list all the servers in the cell instead of the listing the cell itself.
     */
    def 'expandCell'(Boolean value) {
        parameter("expandCell", value)
    }

}
