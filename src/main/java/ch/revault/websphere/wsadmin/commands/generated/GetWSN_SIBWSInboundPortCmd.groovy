/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Retrieve one of the service integration bus inbound ports from a WS-Notification service point.
*/
@Generated("with GenerateAdminCommands")
class GetWSN_SIBWSInboundPortCmd extends AdminCmd<Void> {
    GetWSN_SIBWSInboundPortCmd() {
        super("getWSN_SIBWSInboundPort")
    }

    /**
     * The type of inbound port to retrieve: "BROKER" for the notification broker, "SUB_MGR" for the subscription manager or "PUB_REG_MGR" for the publisher registration manager.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

}
