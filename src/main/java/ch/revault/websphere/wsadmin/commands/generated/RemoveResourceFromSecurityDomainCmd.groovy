/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove a resource from a security domain.
*/
@Generated("with GenerateAdminCommands")
class RemoveResourceFromSecurityDomainCmd extends AdminCmd<Void> {
    RemoveResourceFromSecurityDomainCmd() {
        super("removeResourceFromSecurityDomain")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specifies the resource to remove from the security domain.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

}
