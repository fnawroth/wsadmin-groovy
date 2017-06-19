/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Allows the user to set Administrative Protocol for a server or cell
*/
@Generated("with GenerateAdminCommands")
class SetAdminProtocolCmd extends AdminCmd<Void> {
    SetAdminProtocolCmd() {
        super("setAdminProtocol")
    }

    /**
     * The JMX Connector type you want to set for the server
     */
    def 'conntype'(String value) {
        parameter("conntype", value)
    }

    /**
     * The JMX Connector Mode you want this server to use (either remote or local)
     */
    def 'mode'(String value) {
        parameter("mode", value)
    }

}
