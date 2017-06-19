/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Displays the active JPA specification level for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.
*/
@Generated("with GenerateAdminCommands")
class ShowJPASpecLevelCmd extends AdminCmd<Void> {
    ShowJPASpecLevelCmd() {
        super("showJPASpecLevel")
    }

    /**
     * The Node that the target Server is a member of.
     */
    def 'node'(java.lang.String value) {
        parameter("node", value)
    }

    /**
     * The target Server or ServerCluster for the JPA Specification level change.
     */
    def 'server'(java.lang.String value) {
        parameter("server", value)
    }

}
