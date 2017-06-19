/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Checks if the current run time is JACC enabled in the global security domain.
*/
@Generated("with GenerateAdminCommands")
class IsJACCEnabledCmd extends AdminCmd<Void> {
    IsJACCEnabledCmd() {
        super("isJACCEnabled")
    }

}
