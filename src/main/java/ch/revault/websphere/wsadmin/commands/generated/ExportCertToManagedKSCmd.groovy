/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Export a personal certificate to a managed keystore in the configuration.
*/
@Generated("with GenerateAdminCommands")
class ExportCertToManagedKSCmd extends AdminCmd<Void> {
    ExportCertToManagedKSCmd() {
        super("exportCertToManagedKS")
    }

    /**
     * Specifies the unique name to identify the keystore from which the certificate will be exported.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the password to open the keystore from which the certificate will be exported.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * Specifies the scope of the keystore from which the certificate will be exported.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * The name of the keystore to which the certificate will be exported.
     */
    def 'toKeyStoreName'(String value) {
        parameter("toKeyStoreName", value)
    }

    /**
     * The scope name of the keystore to which the certificate will be exported.
     */
    def 'toKeyStoreScope'(String value) {
        parameter("toKeyStoreScope", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specifies the alias name used to store the certificate in the exported keystore.
     */
    def 'aliasInKeyStore'(String value) {
        parameter("aliasInKeyStore", value)
    }

}
