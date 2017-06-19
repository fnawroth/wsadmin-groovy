/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Export a certificate to another KeyStore.
*/
@Generated("with GenerateAdminCommands")
class ExportCertificateCmd extends AdminCmd<Void> {
    ExportCertificateCmd() {
        super("exportCertificate")
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the password to open the keystore.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * Specifies the scope of the keystore.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Specifies the keystore path from which the certificate will be exported.
     */
    def 'keyFilePath'(String value) {
        parameter("keyFilePath", value)
    }

    /**
     * Specifies the password of the keystore file.
     */
    def 'keyFilePassword'(String value) {
        parameter("keyFilePassword", value)
    }

    /**
     * Specifies the type of the keystore file.
     */
    def 'keyFileType'(String value) {
        parameter("keyFileType", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specifies the alias name of the certificate used in the exported key file.
     */
    def 'aliasInKeyStore'(String value) {
        parameter("aliasInKeyStore", value)
    }

}
