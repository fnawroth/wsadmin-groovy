/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set SAML Issuer Configuration in the specified bindings as custom properties
*/
@Generated("with GenerateAdminCommands")
class SetSAMLIssuerConfigInBindingCmd extends AdminCmd<Void> {
    SetSAMLIssuerConfigInBindingCmd() {
        super("setSAMLIssuerConfigInBinding")
    }

    /**
     * Name of the application or general binding
     */
    def 'bindingName'(String value) {
        parameter("bindingName", value)
    }

    /**
     * Scope of the general binding
     */
    def 'bindingScope'(String value) {
        parameter("bindingScope", value)
    }

    /**
     * application and attachmentId properties
     */
    def 'bindingLocation'(java.util.Properties value) {
        parameter("bindingLocation", value)
    }

    /**
     * Domain name where the general binding exists
     */
    def 'domainName'(String value) {
        parameter("domainName", value)
    }

    /**
     * The URI of the SAML Issuer
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_IssuerURI'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.IssuerURI", value)
    }

    /**
     * Amount of time before expiration of the token               
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_TimeToLiveMilliseconds'(Long value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.TimeToLiveMilliseconds", value)
    }

    /**
     * A reference to a managed keystore from websphere application server global security configuration
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_KeyStoreRef'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.KeyStoreRef", value)
    }

    /**
     * The location of the KeyStore file
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_KeyStorePath'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.KeyStorePath", value)
    }

    /**
     * The type of the KeyStore
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_KeyStoreType'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.KeyStoreType", value)
    }

    /**
     * The password of the KeyStore
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_KeyStorePassword'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.KeyStorePassword", value)
    }

    /**
     * The key alias as defined in the keystore file
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_KeyAlias'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.KeyAlias", value)
    }

    /**
     * The key name as defined in the keystore file
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_KeyName'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.KeyName", value)
    }

    /**
     * The password of the private key as defined in the keystore file
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_KeyPassword'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.KeyPassword", value)
    }

    /**
     * A reference to a managed keystore from websphere application server global security configuration
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_TrustStoreRef'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.TrustStoreRef", value)
    }

    /**
     * The location of the truststore file
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_TrustStorePath'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.TrustStorePath", value)
    }

    /**
     * The type of the truststore
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_TrustStoreType'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.TrustStoreType", value)
    }

    /**
     * The password of the truststore
     */
    def 'com_ibm_wsspi_wssecurity_saml_config_issuer_TrustStorePassword'(String value) {
        parameter("com.ibm.wsspi.wssecurity.saml.config.issuer.TrustStorePassword", value)
    }

}
