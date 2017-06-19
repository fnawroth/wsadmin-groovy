/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* modify a job scheduler attribute
*/
@Generated("with GenerateAdminCommands")
class ModifyJobSchedulerAttributeCmd extends AdminCmd<Void> {
    ModifyJobSchedulerAttributeCmd() {
        super("modifyJobSchedulerAttribute")
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
