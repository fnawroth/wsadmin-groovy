/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a proxy configuration for a Web module
*/
@Generated("with GenerateAdminCommands")
class CreateWebModuleProxyConfigCmd extends AdminCmd<Void> {
    CreateWebModuleProxyConfigCmd() {
        super("createWebModuleProxyConfig")
    }

    /**
     * Name of the Web module
     */
    def 'deployedObjectProxyConfigName'(String value) {
        parameter("deployedObjectProxyConfigName", value)
    }

    /**
     * Boolean value that indicates whether the proxy server is enabled for this Web module.
     */
    def 'enableProxy'(String value) {
        parameter("enableProxy", value)
    }

    /**
     * Protocol (HTTP, HTTPS, or ClientProtocol) the proxy will use when communicating with the web module.
     */
    def 'transportProtocol'(String value) {
        parameter("transportProtocol", value)
    }

}
