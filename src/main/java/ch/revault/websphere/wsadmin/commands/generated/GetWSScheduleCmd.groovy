/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get schedule information.
*/
@Generated("with GenerateAdminCommands")
class GetWSScheduleCmd extends AdminCmd<Void> {
    GetWSScheduleCmd() {
        super("getWSSchedule")
    }

    /**
     * Specifies the schedule name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
