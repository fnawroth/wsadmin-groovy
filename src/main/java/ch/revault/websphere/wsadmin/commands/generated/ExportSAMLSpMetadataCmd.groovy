/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command exports the security configuration SAML TAI SP metadata to a file.
*/
@Generated("with GenerateAdminCommands")
class ExportSAMLSpMetadataCmd extends AdminCmd<Void> {
    ExportSAMLSpMetadataCmd() {
        super("exportSAMLSpMetadata")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify a fully qualified SP metaData file name.
     */
    def 'spMetadataFileName'(String value) {
        parameter("spMetadataFileName", value)
    }

    /**
     * Supply the SSO identifier number.
     */
    def 'ssoId'(Integer value) {
        parameter("ssoId", value)
    }

    /**
     * Specify whether you want assertion signed flag (true/false).
     */
    def 'wantAssertionsSigned'(Boolean value) {
        parameter("wantAssertionsSigned", value)
    }

    /**
     * Specify the encryption method algorithm.
     */
    def 'encryptionMethod'(String value) {
        parameter("encryptionMethod", value)
    }

}
