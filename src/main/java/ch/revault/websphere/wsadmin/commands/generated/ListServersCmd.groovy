/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* list servers of specified server type and node name. If node name is not specified, whole cell will be searched. If the server type is not specified servers of all types are returned.
*/
@Generated("with GenerateAdminCommands")
class ListServersCmd extends AdminCmd<Void> {
    ListServersCmd() {
        super("listServers")
    }

    /**
     * The ServerType eg: APPLICATION_SERVER
     */
    def 'serverType'(String value) {
        parameter("serverType", value)
    }

    /**
     * The Node Name
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
