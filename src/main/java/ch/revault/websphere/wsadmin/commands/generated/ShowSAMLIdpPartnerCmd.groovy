/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command displays the SAML TAI IdP partner in the security configuration. If an idpId is not specified, all the SAML TAI IdP partners are displayed.
*/
@Generated("with GenerateAdminCommands")
class ShowSAMLIdpPartnerCmd extends AdminCmd<Void> {
    ShowSAMLIdpPartnerCmd() {
        super("showSAMLIdpPartner")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Supply the SSO identifier number.
     */
    def 'ssoId'(Integer value) {
        parameter("ssoId", value)
    }

    /**
     * Supply the IdP identifier number.
     */
    def 'idpId'(Integer value) {
        parameter("idpId", value)
    }

}
