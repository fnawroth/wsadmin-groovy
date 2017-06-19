/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import a personal certificate from managed keystore in the configuration.
*/
@Generated("with GenerateAdminCommands")
class ImportCertFromManagedKSCmd extends AdminCmd<Void> {
    ImportCertFromManagedKSCmd() {
        super("importCertFromManagedKS")
    }

    /**
     * Specifies the unique name to identify the keystore to which the certificate will be imported.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the keystore to which the certificate will be imported.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Keystore from which the certificate will be imported.
     */
    def 'fromKeyStoreName'(String value) {
        parameter("fromKeyStoreName", value)
    }

    /**
     * Password of the keystore from which the certificate will be imported.
     */
    def 'fromKeyStorePassword'(String value) {
        parameter("fromKeyStorePassword", value)
    }

    /**
     * The scope name of the keystore from which the certificate will be imported.
     */
    def 'fromKeyStoreScope'(String value) {
        parameter("fromKeyStoreScope", value)
    }

    /**
     * Specifies the alias of the certificate to import from the keystore.
     */
    def 'certificateAliasFromKeyStore'(String value) {
        parameter("certificateAliasFromKeyStore", value)
    }

    /**
     * Unique name used to identify the certificate in the keystore.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

}
