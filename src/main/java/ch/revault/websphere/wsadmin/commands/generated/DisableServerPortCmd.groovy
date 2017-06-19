/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Disable all the transport chains associated with an endpoint on a server. Returns a list of all the disabled transport chains on successful execution of the command.
*/
@Generated("with GenerateAdminCommands")
class DisableServerPortCmd extends AdminCmd<Void> {
    DisableServerPortCmd() {
        super("disableServerPort")
    }

    /**
     * The name of the server node. This parameter is required only if the server name is not unique in the cell.
     */
    def 'nodeName'(java.lang.String value) {
        parameter("nodeName", value)
    }

    /**
     * The name of the end point.
     */
    def 'endPointName'(java.lang.String value) {
        parameter("endPointName", value)
    }

}
