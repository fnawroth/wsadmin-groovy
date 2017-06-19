/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the current Application Security setting of true or false.
*/
@Generated("with GenerateAdminCommands")
class IsAppSecurityEnabledCmd extends AdminCmd<Void> {
    IsAppSecurityEnabledCmd() {
        super("isAppSecurityEnabled")
    }

}
