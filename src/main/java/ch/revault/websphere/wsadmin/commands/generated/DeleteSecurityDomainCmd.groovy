/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes a domain object.
*/
@Generated("with GenerateAdminCommands")
class DeleteSecurityDomainCmd extends AdminCmd<Void> {
    DeleteSecurityDomainCmd() {
        super("deleteSecurityDomain")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * When force is set to true, the security domain is deleted without checking if any resources exist in the domain. This option can be used when the resources in the security domains are not valid resources.
     */
    def 'force'(Boolean value) {
        parameter("force", value)
    }

}
