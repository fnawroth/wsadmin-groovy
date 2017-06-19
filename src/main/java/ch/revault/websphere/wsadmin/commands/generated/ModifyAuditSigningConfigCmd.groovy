/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the audit record signing configuration.
*/
@Generated("with GenerateAdminCommands")
class ModifyAuditSigningConfigCmd extends AdminCmd<Void> {
    ModifyAuditSigningConfigCmd() {
        super("modifyAuditSigningConfig")
    }

    /**
     * Enable audit signing to true or false.
     */
    def 'enableAuditSigning'(Boolean value) {
        parameter("enableAuditSigning", value)
    }

    /**
     * Certificate alias name.
     */
    def 'certAlias'(String value) {
        parameter("certAlias", value)
    }

    /**
     * Reuse the same certificate used to encrypt audit records.
     */
    def 'useEncryptionCert'(Boolean value) {
        parameter("useEncryptionCert", value)
    }

    /**
     * Allow the runtime to automatically generate a certificate.
     */
    def 'autogenCert'(Boolean value) {
        parameter("autogenCert", value)
    }

    /**
     * Import an existing certificate.
     */
    def 'importCert'(Boolean value) {
        parameter("importCert", value)
    }

    /**
     * Name of the key file where the certificate to import exists.
     */
    def 'certKeyFileName'(String value) {
        parameter("certKeyFileName", value)
    }

    /**
     * Path of the key file where the certificate to import exists.
     */
    def 'certKeyFilePath'(String value) {
        parameter("certKeyFilePath", value)
    }

    /**
     * Type of the key file where the certificate to import exists.
     */
    def 'certKeyFileType'(String value) {
        parameter("certKeyFileType", value)
    }

    /**
     * Password for the key file where the certificate to import exists.
     */
    def 'certKeyFilePassword'(String value) {
        parameter("certKeyFilePassword", value)
    }

    /**
     * Certificate alias to import.
     */
    def 'certAliasToImport'(String value) {
        parameter("certAliasToImport", value)
    }

    /**
     * Key store reference id of the keystore used for signing audit records.
     */
    def 'signingKeyStoreRef'(String value) {
        parameter("signingKeyStoreRef", value)
    }

}
