/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the SIB foreign buses.
*/
@Generated("with GenerateAdminCommands")
class ListSIBForeignBusesCmd extends AdminCmd<Void> {
    ListSIBForeignBusesCmd() {
        super("listSIBForeignBuses")
    }

    /**
     * Bus name.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Type name {MQ | SIBus} (only required if routing type is "Direct").
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * Routing type name {Direct | Indirect}.
     */
    def 'routingType'(String value) {
        parameter("routingType", value)
    }

    /**
     * The output from the command is a format suitable for java program clients.
     */
    def 'javaFormat'(Boolean value) {
        parameter("javaFormat", value)
    }

}
