/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the serialized SQLJ profiles that are in an installed application.
*/
@Generated("with GenerateAdminCommands")
class ListSqljProfilesCmd extends AdminCmd<Void> {
    ListSqljProfilesCmd() {
        super("listSqljProfiles")
    }

    /**
     * The name of an installed application that contains the SQLJ profiles to be processed.
     */
    def 'appName'(String value) {
        parameter("appName", value)
    }

}
