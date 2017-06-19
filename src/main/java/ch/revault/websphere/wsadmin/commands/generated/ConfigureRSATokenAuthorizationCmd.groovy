/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Command that modifies the role propagation authorization mechanism
*/
@Generated("with GenerateAdminCommands")
class ConfigureRSATokenAuthorizationCmd extends AdminCmd<Void> {
    ConfigureRSATokenAuthorizationCmd() {
        super("configureRSATokenAuthorization")
    }

    /**
     * The time in minutes when the token is to expire.
     */
    def 'tokenExpiration'(Long value) {
        parameter("tokenExpiration", value)
    }

    /**
     * The time in minutes when nonce value will time out.
     */
    def 'nonceCacheTimeout'(Long value) {
        parameter("nonceCacheTimeout", value)
    }

    /**
     * The name of the trust store used for RSA token authorization.
     */
    def 'adminCertTrustStore'(String value) {
        parameter("adminCertTrustStore", value)
    }

    /**
     * The trust store scope name.
     */
    def 'adminCertTrustStoreScope'(String value) {
        parameter("adminCertTrustStoreScope", value)
    }

    /**
     * The name of the key store used for RSA token authorization.
     */
    def 'adminCertKeyStore'(String value) {
        parameter("adminCertKeyStore", value)
    }

    /**
     * The scope of the RSA token key store.
     */
    def 'adminCertKeyStoreScope'(String value) {
        parameter("adminCertKeyStoreScope", value)
    }

    /**
     * Alias name of the RSA token certificate.
     */
    def 'adminCertAlias'(String value) {
        parameter("adminCertAlias", value)
    }

}
