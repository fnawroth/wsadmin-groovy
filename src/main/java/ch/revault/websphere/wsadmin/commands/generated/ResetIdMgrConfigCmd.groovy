/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Reloads the virtual member manager configuration from the virtual member manager configuration file.
*/
@Generated("with GenerateAdminCommands")
class ResetIdMgrConfigCmd extends AdminCmd<Void> {
    ResetIdMgrConfigCmd() {
        super("resetIdMgrConfig")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
