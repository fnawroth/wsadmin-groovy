/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures the CSI inbound information in the administrative security configuration or in an application security domain.
*/
@Generated("with GenerateAdminCommands")
class ConfigureCSIInboundCmd extends AdminCmd<Void> {
    ConfigureCSIInboundCmd() {
        super("configureCSIInbound")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Message level authentication.  Valid values are: Never, Supported, and Required
     */
    def 'messageLevelAuth'(String value) {
        parameter("messageLevelAuth", value)
    }

    /**
     * Supported authentication mechanisms, valid values are: KRB5, LTPA, BasicAuth, and custom
     */
    def 'supportedAuthMechList'(String value) {
        parameter("supportedAuthMechList", value)
    }

    /**
     * Client certificate authentication.  Values are: Never, Supported, and Required
     */
    def 'clientCertAuth'(String value) {
        parameter("clientCertAuth", value)
    }

    /**
     * Transport layer authentication.  Valid values are: Never, Supported, and Required
     */
    def 'transportLayer'(String value) {
        parameter("transportLayer", value)
    }

    /**
     * Specify SSL configuration alias for inbound connections.
     */
    def 'sslConfiguration'(String value) {
        parameter("sslConfiguration", value)
    }

    /**
     * Specify true to enable identity assertion and false to disable
     */
    def 'enableIdentityAssertion'(Boolean value) {
        parameter("enableIdentityAssertion", value)
    }

    /**
     * A pipe separated list of trusted identities
     */
    def 'trustedIdentities'(String value) {
        parameter("trustedIdentities", value)
    }

    /**
     * Specify true to make the session stateful and false not to have stateful session
     */
    def 'statefulSession'(Boolean value) {
        parameter("statefulSession", value)
    }

    /**
     * Specify to true to enable attribute propagation and false to disable.
     */
    def 'enableAttributePropagation'(Boolean value) {
        parameter("enableAttributePropagation", value)
    }

}
