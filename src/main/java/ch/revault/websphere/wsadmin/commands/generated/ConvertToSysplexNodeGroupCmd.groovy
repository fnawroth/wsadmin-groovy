/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Converts to a sysplex node group
*/
@Generated("with GenerateAdminCommands")
class ConvertToSysplexNodeGroupCmd extends AdminCmd<Void> {
    ConvertToSysplexNodeGroupCmd() {
        super("convertToSysplexNodeGroup")
    }

    /**
     * the shortName (alias) of the node group
     */
    def 'shortName'(String value) {
        parameter("shortName", value)
    }

    /**
     * the sysplex propeties
     */
    def 'sysplexProps'(java.util.Properties value) {
        parameter("sysplexProps", value)
    }

}
