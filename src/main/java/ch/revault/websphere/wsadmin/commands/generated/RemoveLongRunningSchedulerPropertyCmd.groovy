/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* (Deprecated) remove a property from the long-running scheduler. Use removeJobSchedulerProperty.
*/
@Generated("with GenerateAdminCommands")
class RemoveLongRunningSchedulerPropertyCmd extends AdminCmd<Void> {
    RemoveLongRunningSchedulerPropertyCmd() {
        super("removeLongRunningSchedulerProperty")
    }

    /**
     * name of the property
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
