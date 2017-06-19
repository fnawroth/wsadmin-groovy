/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add a signer certificates from a certificate file to a keystore.
*/
@Generated("with GenerateAdminCommands")
class AddSignerCertificateCmd extends AdminCmd<Void> {
    AddSignerCertificateCmd() {
        super("addSignerCertificate")
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
     * Specifies the fully-qualified path for the certificate file.
     */
    def 'certificateFilePath'(String value) {
        parameter("certificateFilePath", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specify true for a Base64 encoded ASCII data file type or false for a binary DER data file type.
     */
    def 'base64Encoded'(Boolean value) {
        parameter("base64Encoded", value)
    }

}
