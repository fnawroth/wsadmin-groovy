/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Enable provisioning on a server. Some components will be started as they are needed.
*/
@Generated("with GenerateAdminCommands")
class EnableProvisioningCmd extends AdminCmd<Void> {
    EnableProvisioningCmd() {
        super("enableProvisioning")
    }

    /**
     * The name of the node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The name of the server.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * Help for this command.
     */
    def 'help'(String value) {
        parameter("help", value)
    }

}
