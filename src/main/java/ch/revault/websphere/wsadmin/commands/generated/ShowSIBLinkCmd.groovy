/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show detail for a SIB link.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBLinkCmd extends AdminCmd<Void> {
    ShowSIBLinkCmd() {
        super("showSIBLink")
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

    /**
     * The output from the command is a format suitable for java program clients.
     */
    def 'javaFormat'(Boolean value) {
        parameter("javaFormat", value)
    }

}
