/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Retrieve a signer certificate from a port and add it to the KeyStore.
*/
@Generated("with GenerateAdminCommands")
class RetrieveSignerFromPortCmd extends AdminCmd<Void> {
    RetrieveSignerFromPortCmd() {
        super("retrieveSignerFromPort")
    }

    /**
     * Specifies the name of the host where the signer certificate will be retrieved.
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * Specifies the port on the host where the signer certificate will be retrieved.
     */
    def 'port'(Integer value) {
        parameter("port", value)
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
     * Specifies the SSL configuration used to connect to the host.
     */
    def 'sslConfigName'(String value) {
        parameter("sslConfigName", value)
    }

    /**
     * Specifies the scope name of the SSL configuration.   
     */
    def 'sslConfigScopeName'(String value) {
        parameter("sslConfigScopeName", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

}
