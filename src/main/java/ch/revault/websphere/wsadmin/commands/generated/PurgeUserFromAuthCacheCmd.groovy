/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Purges a user from the auth cache for a security domain; if no security domain is specified, the user will be purged from the admin security domain
*/
@Generated("with GenerateAdminCommands")
class PurgeUserFromAuthCacheCmd extends AdminCmd<Void> {
    PurgeUserFromAuthCacheCmd() {
        super("purgeUserFromAuthCache")
    }

    /**
     * The username of the auth data.
     */
    def 'user'(String value) {
        parameter("user", value)
    }

    /**
     * Specifies the name of the security realm from which a user will be purged.
     */
    def 'securityRealmName'(String value) {
        parameter("securityRealmName", value)
    }

    /**
     * Id used to uniquely identify the security domain
     */
    def 'securityDomainId'(String value) {
        parameter("securityDomainId", value)
    }

}
