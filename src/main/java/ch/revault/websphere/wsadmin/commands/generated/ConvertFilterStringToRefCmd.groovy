/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Converts an audit specification event and outcome to a reference representation.
*/
@Generated("with GenerateAdminCommands")
class ConvertFilterStringToRefCmd extends AdminCmd<Void> {
    ConvertFilterStringToRefCmd() {
        super("convertFilterStringToRef")
    }

    /**
     * Supply a valid audit specification in the form event:outcome using the shortened form of the event.
     */
    def 'filter'(String value) {
        parameter("filter", value)
    }

}
