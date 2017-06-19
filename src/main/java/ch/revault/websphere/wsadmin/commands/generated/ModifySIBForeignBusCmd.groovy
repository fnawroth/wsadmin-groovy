/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a SIB foreign bus.
*/
@Generated("with GenerateAdminCommands")
class ModifySIBForeignBusCmd extends AdminCmd<Void> {
    ModifySIBForeignBusCmd() {
        super("modifySIBForeignBus")
    }

    /**
     * Bus name.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Foreign bus name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Description.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Send allowed {True | False} (default is "True").
     */
    def 'sendAllowed'(Boolean value) {
        parameter("sendAllowed", value)
    }

    /**
     * Inbound user identifier.
     */
    def 'inboundUserid'(String value) {
        parameter("inboundUserid", value)
    }

    /**
     * Outbound user identifier.
     */
    def 'outboundUserid'(String value) {
        parameter("outboundUserid", value)
    }

    /**
     * Next hop bus name.
     */
    def 'nextHopBus'(String value) {
        parameter("nextHopBus", value)
    }

}
