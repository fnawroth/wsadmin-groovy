/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Converts an audit specification reference to a string representation.
*/
@Generated("with GenerateAdminCommands")
class ConvertFilterRefToStringCmd extends AdminCmd<Void> {
    ConvertFilterRefToStringCmd() {
        super("convertFilterRefToString")
    }

    /**
     * Supply a valid audit specification reference.
     */
    def 'filterRef'(String value) {
        parameter("filterRef", value)
    }

}
