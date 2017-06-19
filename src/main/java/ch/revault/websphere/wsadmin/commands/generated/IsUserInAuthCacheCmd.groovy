/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* isUserInAuthCache
*/
@Generated("with GenerateAdminCommands")
class IsUserInAuthCacheCmd extends AdminCmd<Void> {
    IsUserInAuthCacheCmd() {
        super("isUserInAuthCache")
    }

    /**
     * The username of the auth data.
     */
    def 'user'(String value) {
        parameter("user", value)
    }

    /**
     * Specifies the name of the security realm for which a group list will be returned.
     */
    def 'securityRealmName'(String value) {
        parameter("securityRealmName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
