/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Register the node with an adminagent
*/
@Generated("with GenerateAdminCommands")
class RegisterWithAdminAgentCmd extends AdminCmd<Void> {
    RegisterWithAdminAgentCmd() {
        super("registerWithAdminAgent")
    }

    /**
     * registerPropertiesDesc
     */
    def 'properties'(java.util.Properties value) {
        parameter("properties", value)
    }

}
