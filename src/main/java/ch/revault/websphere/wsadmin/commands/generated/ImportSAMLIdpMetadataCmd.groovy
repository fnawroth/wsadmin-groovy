/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command imports SAML IdP metadata to the security configuration SAML TAI.
*/
@Generated("with GenerateAdminCommands")
class ImportSAMLIdpMetadataCmd extends AdminCmd<Void> {
    ImportSAMLIdpMetadataCmd() {
        super("importSAMLIdpMetadata")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify a fully qualified IdP metaData file name.
     */
    def 'idpMetadataFileName'(String value) {
        parameter("idpMetadataFileName", value)
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

    /**
     * Unique name to identify a certificate.
     */
    def 'signingCertAlias'(String value) {
        parameter("signingCertAlias", value)
    }

}
