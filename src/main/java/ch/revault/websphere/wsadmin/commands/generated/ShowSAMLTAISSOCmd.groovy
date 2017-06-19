/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command displays the SAML TAI SSO in the security configuration. If an ssoId is not specified, all the SAML TAI SSO service providers are displayed.
*/
@Generated("with GenerateAdminCommands")
class ShowSAMLTAISSOCmd extends AdminCmd<Void> {
    ShowSAMLTAISSOCmd() {
        super("showSAMLTAISSO")
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

}
