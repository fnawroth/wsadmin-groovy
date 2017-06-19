/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Clears the auth cache for a security domain; if no security domain is specified, the auth cache for the admin security domain will be cleared
*/
@Generated("with GenerateAdminCommands")
class ClearAuthCacheCmd extends AdminCmd<Void> {
    ClearAuthCacheCmd() {
        super("clearAuthCache")
    }

    /**
     * Id used to uniquely identify the security domain
     */
    def 'securityDomainId'(String value) {
        parameter("securityDomainId", value)
    }

}
