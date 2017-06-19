/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the NamedEndPoints endpoints that can be associated with a UDPInboundChannel
*/
@Generated("with GenerateAdminCommands")
class ListUDPEndPointsCmd extends AdminCmd<Void> {
    ListUDPEndPointsCmd() {
        super("listUDPEndPoints")
    }

    /**
     * If specified,  this command shows only non-distinguished NamedEndPoints endpoints.
     */
    def 'excludeDistinguished'(java.lang.Boolean value) {
        parameter("excludeDistinguished", value)
    }

    /**
     * If specified, this command shows only the NamedEndPoints endpoints that are not in use by other UDPInboundChannel instances.
     */
    def 'unusedOnly'(java.lang.Boolean value) {
        parameter("unusedOnly", value)
    }

}
