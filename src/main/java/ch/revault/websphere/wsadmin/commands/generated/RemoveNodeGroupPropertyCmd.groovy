/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* remove a property from a node group
*/
@Generated("with GenerateAdminCommands")
class RemoveNodeGroupPropertyCmd extends AdminCmd<Void> {
    RemoveNodeGroupPropertyCmd() {
        super("removeNodeGroupProperty")
    }

    /**
     * name of the property
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
