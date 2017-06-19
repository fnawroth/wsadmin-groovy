/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* renameNode
*/
@Generated("with GenerateAdminCommands")
class RenameNodeCmd extends AdminCmd<Void> {
    RenameNodeCmd() {
        super("renameNode")
    }

    /**
     * current node name
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * newNode
     */
    def 'newNodeName'(String value) {
        parameter("newNodeName", value)
    }

    /**
     * shortName
     */
    def 'shortName'(String value) {
        parameter("shortName", value)
    }

}
