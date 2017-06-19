/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete the proxy server configuration for a Web module
*/
@Generated("with GenerateAdminCommands")
class DeleteWebModuleProxyConfigCmd extends AdminCmd<Void> {
    DeleteWebModuleProxyConfigCmd() {
        super("deleteWebModuleProxyConfig")
    }

    /**
     * Name of the Web module
     */
    def 'deployedObjectProxyConfigName'(String value) {
        parameter("deployedObjectProxyConfigName", value)
    }

}
