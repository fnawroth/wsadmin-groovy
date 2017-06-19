/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import a Certificate from another keyStore to this KeyStore.
*/
@Generated("with GenerateAdminCommands")
class ImportAuditCertificateCmd extends AdminCmd<Void> {
    ImportAuditCertificateCmd() {
        super("importAuditCertificate")
    }

    /**
     * Specifies the unique name to identify the key store.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the key store.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Specifies the key store path name that contains the certificate to import.
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
     * Specifies the alias of the certificate to import from the key store file.
     */
    def 'certificateAliasFromKeyFile'(String value) {
        parameter("certificateAliasFromKeyFile", value)
    }

    /**
     * Certificate alias name.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

}
