/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the WSNServicePoint objects in the configuration of the target WSNService that match the specified input parameters.
*/
@Generated("with GenerateAdminCommands")
class ListWSNServicePointsCmd extends AdminCmd<Void> {
    ListWSNServicePointsCmd() {
        super("listWSNServicePoints")
    }

    /**
     * Name
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
