/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all destinations which have roles defined on them.
*/
@Generated("with GenerateAdminCommands")
class ListAllDestinationsWithRolesCmd extends AdminCmd<Void> {
    ListAllDestinationsWithRolesCmd() {
        super("listAllDestinationsWithRoles")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The destination type.  Allowable values are ( Queue | Port | Webservice | TopicSpace | ForeignDestination | Alias )
     */
    def 'type'(String value) {
        parameter("type", value)
    }

}
