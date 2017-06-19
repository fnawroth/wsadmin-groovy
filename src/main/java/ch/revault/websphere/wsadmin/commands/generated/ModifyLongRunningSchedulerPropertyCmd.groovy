/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* (Deprecated) modify the property of the long-running scheduler. Use modifyJobSchedulerProperty.
*/
@Generated("with GenerateAdminCommands")
class ModifyLongRunningSchedulerPropertyCmd extends AdminCmd<Void> {
    ModifyLongRunningSchedulerPropertyCmd() {
        super("modifyLongRunningSchedulerProperty")
    }

    /**
     * name of the property
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

    /**
     * description
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
