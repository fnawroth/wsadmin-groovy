/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show the properties of a WSNServicePoint object in a human readable form.
*/
@Generated("with GenerateAdminCommands")
class ShowWSNServicePointCmd extends AdminCmd<Void> {
    ShowWSNServicePointCmd() {
        super("showWSNServicePoint")
    }

    /**
     * Name
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
