/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Extract a certificate request to a file.
*/
@Generated("with GenerateAdminCommands")
class ExtractCertificateRequestCmd extends AdminCmd<Void> {
    ExtractCertificateRequestCmd() {
        super("extractCertificateRequest")
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the keystore.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specifies the full path name to the file where the certificate request is extracted.
     */
    def 'certificateRequestFilePath'(String value) {
        parameter("certificateRequestFilePath", value)
    }

}
