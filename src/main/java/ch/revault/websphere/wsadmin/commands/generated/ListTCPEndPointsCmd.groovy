/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all NamedEndPoints that can be associated with a TCPInboundChannel
*/
@Generated("with GenerateAdminCommands")
class ListTCPEndPointsCmd extends AdminCmd<Void> {
    ListTCPEndPointsCmd() {
        super("listTCPEndPoints")
    }

    /**
     * If specified this command will only show non-distinguished NamedEndPoints
     */
    def 'excludeDistinguished'(java.lang.Boolean value) {
        parameter("excludeDistinguished", value)
    }

    /**
     * If specified this command will only show NamedEndPoints not in use by other TCPInboundChannel instances
     */
    def 'unusedOnly'(java.lang.Boolean value) {
        parameter("unusedOnly", value)
    }

}
