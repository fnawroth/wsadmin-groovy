/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures a trust association.
*/
@Generated("with GenerateAdminCommands")
class ConfigureTrustAssociationCmd extends AdminCmd<Void> {
    ConfigureTrustAssociationCmd() {
        super("configureTrustAssociation")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Set to enable or disable the trust association.
     */
    def 'enable'(Boolean value) {
        parameter("enable", value)
    }

}
