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
class ExportAuditCertificateCmd extends AdminCmd<Void> {
    ExportAuditCertificateCmd() {
        super("exportAuditCertificate")
    }

    /**
     * Specifies the unique name to identify the key store.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the password to open the key store.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * Specifies the scope of the key store.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Specifies the key store path which the certificate will be exported.
     */
    def 'keyFilePath'(String value) {
        parameter("keyFilePath", value)
    }

    /**
     * Specifies the password of the key store file.
     */
    def 'keyFilePassword'(String value) {
        parameter("keyFilePassword", value)
    }

    /**
     * Specifies the type of the key store file.
     */
    def 'keyFileType'(String value) {
        parameter("keyFileType", value)
    }

    /**
     * Certificate alias name.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specifies the alias name of the certificate used in the exported file.
     */
    def 'aliasInKeyStore'(String value) {
        parameter("aliasInKeyStore", value)
    }

}
