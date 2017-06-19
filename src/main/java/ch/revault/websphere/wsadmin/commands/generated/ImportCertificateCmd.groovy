/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* port a Certificate from another keystore to this keystore.
*/
@Generated("with GenerateAdminCommands")
class ImportCertificateCmd extends AdminCmd<Void> {
    ImportCertificateCmd() {
        super("importCertificate")
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
     * Specifies the keystore path name that contains the certificate to import.
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
     * Specifies the alias of the certificate to import from the keystore file.
     */
    def 'certificateAliasFromKeyFile'(String value) {
        parameter("certificateAliasFromKeyFile", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

}
