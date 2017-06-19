/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies an existing cookie configuration
*/
@Generated("with GenerateAdminCommands")
class ModifyDisabledSessionCookieCmd extends AdminCmd<Void> {
    ModifyDisabledSessionCookieCmd() {
        super("modifyDisabledSessionCookie")
    }

    /**
     * The Id of the cookie
     */
    def 'cookieId'(java.lang.String value) {
        parameter("cookieId", value)
    }

    /**
     * The domain, name, and path must match for a cookie to disallow additional configuration.  This is the domain parameter.
     */
    def 'cookieDomain'(java.lang.String value) {
        parameter("cookieDomain", value)
    }

    /**
     * The domain, name, and path must match for a cookie to disallow additional configuration.  This is the name parameter.
     */
    def 'cookieName'(java.lang.String value) {
        parameter("cookieName", value)
    }

    /**
     * The domain, name, and path must match for a cookie to disallow additional configuration.  This is the path parameter.
     */
    def 'cookiePath'(java.lang.String value) {
        parameter("cookiePath", value)
    }

}
