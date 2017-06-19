/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show the properties of a WSNService object in a human readable form.
*/
@Generated("with GenerateAdminCommands")
class ShowWSNServiceCmd extends AdminCmd<Void> {
    ShowWSNServiceCmd() {
        super("showWSNService")
    }

    /**
     * Bus
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Name
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
