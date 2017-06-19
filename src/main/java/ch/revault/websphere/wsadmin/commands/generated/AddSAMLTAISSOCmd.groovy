/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command adds the SAML Single Sign-On (SSO) service provider (SP) to the security configuration SAML TAI.
*/
@Generated("with GenerateAdminCommands")
class AddSAMLTAISSOCmd extends AdminCmd<Void> {
    AddSAMLTAISSOCmd() {
        super("addSAMLTAISSO")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Supply the SSO identifier number.
     */
    def 'ssoId'(Integer value) {
        parameter("ssoId", value)
    }

    /**
     * Set to enable or disable the trust association.
     */
    def 'enable'(Boolean value) {
        parameter("enable", value)
    }

    /**
     * Specifies a trust store name. If a trustStoreName is not specified, the default trust store is used.
     */
    def 'trustStoreName'(String value) {
        parameter("trustStoreName", value)
    }

    /**
     * Specifies an Assertion Consumer Service URL.
     */
    def 'acsUrl'(String value) {
        parameter("acsUrl", value)
    }

    /**
     * Specifies the unique name to identify the key store.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies a key name.
     */
    def 'keyName'(String value) {
        parameter("keyName", value)
    }

    /**
     * Specifies a key alias.
     */
    def 'keyAlias'(String value) {
        parameter("keyAlias", value)
    }

    /**
     * Specifies a key password.
     */
    def 'keyPassword'(String value) {
        parameter("keyPassword", value)
    }

    /**
     * Supply the URI of a resource to redirect if the cookie in the SP is expired or the user comes to the SP without going to IdP first. 
     */
    def 'errorPage'(String value) {
        parameter("errorPage", value)
    }

    /**
     * Specifies the idMap. Valid value are idAssertion, localRealm, or localRealmThenIdAssertion. 
     */
    def 'idMap'(String value) {
        parameter("idMap", value)
    }

}
