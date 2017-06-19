/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update SAML Issuer Configuration data
*/
@Generated("with GenerateAdminCommands")
class UpdateSAMLIssuerConfigCmd extends AdminCmd<Void> {
    UpdateSAMLIssuerConfigCmd() {
        super("updateSAMLIssuerConfig")
    }

    /**
     * Node name where the SAML Issuer Config file resides
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Server name where the SAML Issuer Config file resides 
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The URI of the SAML Issuer
     */
    def 'IssuerURI'(String value) {
        parameter("IssuerURI", value)
    }

    /**
     * Amount of time before expiration of the token               
     */
    def 'TimeToLiveMilliseconds'(Long value) {
        parameter("TimeToLiveMilliseconds", value)
    }

    /**
     * A reference to a managed keystore from websphere application server global security configuration
     */
    def 'KeyStoreRef'(String value) {
        parameter("KeyStoreRef", value)
    }

    /**
     * The location of the KeyStore file
     */
    def 'KeyStorePath'(String value) {
        parameter("KeyStorePath", value)
    }

    /**
     * The type of the KeyStore
     */
    def 'KeyStoreType'(String value) {
        parameter("KeyStoreType", value)
    }

    /**
     * The password of the KeyStore
     */
    def 'KeyStorePassword'(String value) {
        parameter("KeyStorePassword", value)
    }

    /**
     * The key alias as defined in the keystore file
     */
    def 'KeyAlias'(String value) {
        parameter("KeyAlias", value)
    }

    /**
     * The key name as defined in the keystore file
     */
    def 'KeyName'(String value) {
        parameter("KeyName", value)
    }

    /**
     * The password of the private key as defined in the keystore file
     */
    def 'KeyPassword'(String value) {
        parameter("KeyPassword", value)
    }

    /**
     * A reference to a managed keystore from websphere application server global security configuration
     */
    def 'TrustStoreRef'(String value) {
        parameter("TrustStoreRef", value)
    }

    /**
     * The location of the truststore file
     */
    def 'TrustStorePath'(String value) {
        parameter("TrustStorePath", value)
    }

    /**
     * The type of the truststore
     */
    def 'TrustStoreType'(String value) {
        parameter("TrustStoreType", value)
    }

    /**
     * The password of the truststore
     */
    def 'TrustStorePassword'(String value) {
        parameter("TrustStorePassword", value)
    }

}
