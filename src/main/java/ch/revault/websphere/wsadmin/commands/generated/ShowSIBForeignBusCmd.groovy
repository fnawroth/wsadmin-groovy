/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show detail for a SIB foreign bus.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBForeignBusCmd extends AdminCmd<Void> {
    ShowSIBForeignBusCmd() {
        super("showSIBForeignBus")
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

}
