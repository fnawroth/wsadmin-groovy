/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* remove a property from the job scheduler
*/
@Generated("with GenerateAdminCommands")
class RemoveJobSchedulerPropertyCmd extends AdminCmd<Void> {
    RemoveJobSchedulerPropertyCmd() {
        super("removeJobSchedulerProperty")
    }

    /**
     * name of the property
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
