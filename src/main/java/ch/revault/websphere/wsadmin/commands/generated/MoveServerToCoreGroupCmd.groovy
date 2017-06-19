/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Move a server from one core group to another.
*/
@Generated("with GenerateAdminCommands")
class MoveServerToCoreGroupCmd extends AdminCmd<Void> {
    MoveServerToCoreGroupCmd() {
        super("moveServerToCoreGroup")
    }

    /**
     * The name of the core group the server is to be moved from
     */
    def 'source'(String value) {
        parameter("source", value)
    }

    /**
     * The name of the core group the server is to be moved to
     */
    def 'target'(String value) {
        parameter("target", value)
    }

    /**
     * The name of the node hosting the server
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The name of the server
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

}
