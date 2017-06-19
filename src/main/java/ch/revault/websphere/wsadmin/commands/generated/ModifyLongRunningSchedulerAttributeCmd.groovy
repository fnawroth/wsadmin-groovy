/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* (Deprecated) modify a long-running scheduler attribute. Use modifyJobSchedulerAttribute.
*/
@Generated("with GenerateAdminCommands")
class ModifyLongRunningSchedulerAttributeCmd extends AdminCmd<Void> {
    ModifyLongRunningSchedulerAttributeCmd() {
        super("modifyLongRunningSchedulerAttribute")
    }

    /**
     * name of attribute
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * value 
     */
    def 'value'(String value) {
        parameter("value", value)
    }

}
