/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command removes the SAML TAI SSO from the security configuration.
*/
@Generated("with GenerateAdminCommands")
class DeleteSAMLTAISSOCmd extends AdminCmd<Void> {
    DeleteSAMLTAISSOCmd() {
        super("deleteSAMLTAISSO")
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
     * Specify true to remove a signing certificate from the trustStore.
     */
    def 'deleteSigningCert'(Boolean value) {
        parameter("deleteSigningCert", value)
    }

}
