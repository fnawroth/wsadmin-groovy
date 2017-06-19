/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Changes the active JPA specification level for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.  The specLevel parameter must always be specified.
*/
@Generated("with GenerateAdminCommands")
class ModifyJPASpecLevelCmd extends AdminCmd<Void> {
    ModifyJPASpecLevelCmd() {
        super("modifyJPASpecLevel")
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

    /**
     * The new JPA Specification level to change the target to.
     */
    def 'specLevel'(java.lang.String value) {
        parameter("specLevel", value)
    }

}
