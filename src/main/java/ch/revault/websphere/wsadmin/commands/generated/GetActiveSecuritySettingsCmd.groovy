/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Gets the active security setting for global security or in a security domain.
*/
@Generated("with GenerateAdminCommands")
class GetActiveSecuritySettingsCmd extends AdminCmd<Void> {
    GetActiveSecuritySettingsCmd() {
        super("getActiveSecuritySettings")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
