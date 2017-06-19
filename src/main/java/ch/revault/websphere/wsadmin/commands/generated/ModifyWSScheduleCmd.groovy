/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a schedule.
*/
@Generated("with GenerateAdminCommands")
class ModifyWSScheduleCmd extends AdminCmd<Void> {
    ModifyWSScheduleCmd() {
        super("modifyWSSchedule")
    }

    /**
     * Specifies the schedule name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Amount of time in days between scheduled runs.
     */
    def 'frequency'(Integer value) {
        parameter("frequency", value)
    }

    /**
     * Specifies the day of the week when the schedule is to run.  Valid values include 1-7.
     */
    def 'dayOfWeek'(Integer value) {
        parameter("dayOfWeek", value)
    }

    /**
     * Specifies the hour of the day when the schedule is to run.  Valid values include 0-23.
     */
    def 'hour'(Integer value) {
        parameter("hour", value)
    }

    /**
     * Specifies the minute of the hour when then schedule is to run. Valid values include 0-59.
     */
    def 'minute'(Integer value) {
        parameter("minute", value)
    }

    /**
     * Specifies the scheduler's next start date.
     */
    def 'nextStartDate'(Long value) {
        parameter("nextStartDate", value)
    }

}
