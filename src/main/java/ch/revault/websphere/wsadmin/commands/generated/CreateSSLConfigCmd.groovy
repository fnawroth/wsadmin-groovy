/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a SSL Configuration.
*/
@Generated("with GenerateAdminCommands")
class CreateSSLConfigCmd extends AdminCmd<Void> {
    CreateSSLConfigCmd() {
        super("createSSLConfig")
    }

    /**
     * Specifies alias that uniquely identifies a SSL configuration.
     */
    def 'alias'(String value) {
        parameter("alias", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specifies the name of the client key.
     */
    def 'clientKeyAlias'(String value) {
        parameter("clientKeyAlias", value)
    }

    /**
     * Specifies the name of the server key.
     */
    def 'serverKeyAlias'(String value) {
        parameter("serverKeyAlias", value)
    }

    /**
     * Specifies the SSL type, SSSL or JSSE.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * Specify true if client authentication is desired and false otherwise.
     */
    def 'clientAuthentication'(Boolean value) {
        parameter("clientAuthentication", value)
    }

    /**
     * Specifies the security level of the SSL configuration, HIGH, MEDIUM, LOW, or CUSTOM.
     */
    def 'securityLevel'(String value) {
        parameter("securityLevel", value)
    }

    /**
     * Specifies the ciphers enabled for this SSL Configuration.
     */
    def 'enabledCiphers'(String value) {
        parameter("enabledCiphers", value)
    }

    /**
     * Specifies the JSSE provider for the SSL configuration.
     */
    def 'jsseProvider'(String value) {
        parameter("jsseProvider", value)
    }

    /**
     * Specify true if client authentication is supported and false otherwise.
     */
    def 'clientAuthenticationSupported'(Boolean value) {
        parameter("clientAuthenticationSupported", value)
    }

    /**
     * Specifies the SSL protocol.
     */
    def 'sslProtocol'(String value) {
        parameter("sslProtocol", value)
    }

    /**
     * Specifies a colon separated list of trust manager object names.
     */
    def 'trustManagerObjectNames'(String value) {
        parameter("trustManagerObjectNames", value)
    }

    /**
     * Specifies a reference to a specific TrustStore for JSSE purposes.
     */
    def 'trustStoreName'(String value) {
        parameter("trustStoreName", value)
    }

    /**
     * Specifies the scope of the trust store.
     */
    def 'trustStoreScopeName'(String value) {
        parameter("trustStoreScopeName", value)
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
    def 'keyStoreScopeName'(String value) {
        parameter("keyStoreScopeName", value)
    }

    /**
     * Specifies the name of the Key Manager.
     */
    def 'keyManagerName'(String value) {
        parameter("keyManagerName", value)
    }

    /**
     * Specifies the scope of the key manager.
     */
    def 'keyManagerScopeName'(String value) {
        parameter("keyManagerScopeName", value)
    }

    /**
     * Specifies the keyring file name for a System SSL (SSSL) configuration type.
     */
    def 'ssslKeyRingName'(String value) {
        parameter("ssslKeyRingName", value)
    }

    /**
     * Specifies the time out in seconds for System SSL configuration types.  Value ranges from 1-86400.
     */
    def 'v3timeout'(Integer value) {
        parameter("v3timeout", value)
    }

}
