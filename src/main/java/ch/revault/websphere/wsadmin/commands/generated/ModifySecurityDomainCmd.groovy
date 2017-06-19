/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies a security domain's description.
*/
@Generated("with GenerateAdminCommands")
class ModifySecurityDomainCmd extends AdminCmd<Void> {
    ModifySecurityDomainCmd() {
        super("modifySecurityDomain")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Description of the security domain.
     */
    def 'securityDomainDescription'(String value) {
        parameter("securityDomainDescription", value)
    }

}
