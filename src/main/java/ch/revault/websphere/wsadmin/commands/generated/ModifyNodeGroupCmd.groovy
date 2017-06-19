/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* modify a node group configuration
*/
@Generated("with GenerateAdminCommands")
class ModifyNodeGroupCmd extends AdminCmd<Void> {
    ModifyNodeGroupCmd() {
        super("modifyNodeGroup")
    }

    /**
     * the shortName (alias) of the node group
     */
    def 'shortName'(String value) {
        parameter("shortName", value)
    }

    /**
     * a description for the node group
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
