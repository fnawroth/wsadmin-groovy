/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command adds the custom properties to the security configuration for the embedded Tivoli Access Manager Trust Association Interceptor with classname TAMTrustAsociationInterceptorPlus.
*/
@Generated("with GenerateAdminCommands")
class ConfigureTAMTAIPropertiesCmd extends AdminCmd<Void> {
    ConfigureTAMTAIPropertiesCmd() {
        super("configureTAMTAIProperties")
    }

    /**
     * Specifies the name of the Tivoli Access Manager trusted user that will be used to authenticate trust.
     */
    def 'loginId'(String value) {
        parameter("loginId", value)
    }

    /**
     * Specifies whether or not the tai should examine the via header when determining if the request can be handled by this interceptor.
     */
    def 'checkViaHeader'(String value) {
        parameter("checkViaHeader", value)
    }

    /**
     * Specifies the headers that must exist for the request to be handled by this interceptor. Multiple values can be entered in a comma separated list.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Specifies the hostnames that are trusted. If the via header contains other names then the request will not be handled by this interceptor. Multiple values can be entered in a comma separated list.
     */
    def 'hostnames'(String value) {
        parameter("hostnames", value)
    }

    /**
     * Specifies the ports that are trusted. If the via header contains other ports then the request will not be handled by this interceptor. Multiple values can be entered in a comma separated list.
     */
    def 'ports'(String value) {
        parameter("ports", value)
    }

    /**
     * Specifies how many of the hosts in the via header need to be trusted. Hosts are counted in reverse order starting from the last one.
     */
    def 'viaDepth'(String value) {
        parameter("viaDepth", value)
    }

    /**
     * Specifies the timeout for the trust authentication cache.
     */
    def 'ssoPwdExpiry'(String value) {
        parameter("ssoPwdExpiry", value)
    }

    /**
     * Specifies whether or not to ignore proxy servers when examining the via header for trusted hosts.
     */
    def 'ignoreProxy'(String value) {
        parameter("ignoreProxy", value)
    }

    /**
     * Specifies the url for the SvrSslCfg generated Tivoli Access Manager client configuration properties file.
     */
    def 'configURL'(String value) {
        parameter("configURL", value)
    }

}
