/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a SIB link.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBLinkCmd extends AdminCmd<Void> {
    DeleteSIBLinkCmd() {
        super("deleteSIBLink")
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
     * The name of the SIB link.
     */
    def 'sibLink'(String value) {
        parameter("sibLink", value)
    }

}
