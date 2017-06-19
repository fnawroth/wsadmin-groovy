/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an WebSphere MQ link.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBMQLinkCmd extends AdminCmd<Void> {
    DeleteSIBMQLinkCmd() {
        super("deleteSIBMQLink")
    }

    /**
     * The name of the bus.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the messaging engine.
     */
    def 'messagingEngine'(String value) {
        parameter("messagingEngine", value)
    }

    /**
     * The name of the WebSphere MQ link.
     */
    def 'mqLink'(String value) {
        parameter("mqLink", value)
    }

}
