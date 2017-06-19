/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes the trust association object from a security domain.
*/
@Generated("with GenerateAdminCommands")
class UnconfigureTrustAssociationCmd extends AdminCmd<Void> {
    UnconfigureTrustAssociationCmd() {
        super("unconfigureTrustAssociation")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
