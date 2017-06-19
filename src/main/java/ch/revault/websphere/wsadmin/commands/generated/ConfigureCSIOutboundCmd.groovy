/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures the CSI outbound information in the administrative security configuration or in an application security domain.
*/
@Generated("with GenerateAdminCommands")
class ConfigureCSIOutboundCmd extends AdminCmd<Void> {
    ConfigureCSIOutboundCmd() {
        super("configureCSIOutbound")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify to true to enable attribute propagation and false to disable.
     */
    def 'enableAttributePropagation'(Boolean value) {
        parameter("enableAttributePropagation", value)
    }

    /**
     * Specify true to enable identity assertion and false to disable
     */
    def 'enableIdentityAssertion'(Boolean value) {
        parameter("enableIdentityAssertion", value)
    }

    /**
     * Specify true to use the server identity
     */
    def 'useServerIdentity'(Boolean value) {
        parameter("useServerIdentity", value)
    }

    /**
     * Trusted identity
     */
    def 'trustedId'(String value) {
        parameter("trustedId", value)
    }

    /**
     * Trusted identity password
     */
    def 'trustedIdentityPassword'(String value) {
        parameter("trustedIdentityPassword", value)
    }

    /**
     * Basic authentication level.  Valid values are: Never, Supported, and Required
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
     * Client certificate authentication values are: Never, Supported, and Required
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
     * Specify true to make the session stateful and false not to have stateful session
     */
    def 'statefulSession'(Boolean value) {
        parameter("statefulSession", value)
    }

    /**
     * Specify true to enable outbound mapping and false to disable outbound mapping
     */
    def 'enableOutboundMapping'(Boolean value) {
        parameter("enableOutboundMapping", value)
    }

    /**
     * List of realms the server trusts, separated by a pipe character (|).
     */
    def 'trustedTargetRealms'(String value) {
        parameter("trustedTargetRealms", value)
    }

    /**
     * Specify true to enable the CSIv2 session cache limit and false to disable it.
     */
    def 'enableCacheLimit'(Boolean value) {
        parameter("enableCacheLimit", value)
    }

    /**
     * Specifies the maximum number of entries in the CSIv2 session cache. The valid range is between 100 and 1000 entries.
     */
    def 'maxCacheSize'(Integer value) {
        parameter("maxCacheSize", value)
    }

    /**
     * Specifies the period of time in milliseconds that a CSIv2 session can remain idle before it is deleted when the maximum cache size limit is reached. The valid range is between 60,000 and 86,400,000 milliseconds.
     */
    def 'idleSessionTimeout'(Integer value) {
        parameter("idleSessionTimeout", value)
    }

}
