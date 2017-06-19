/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a cookie configuration so that applications will be able to programmatically modify
*/
@Generated("with GenerateAdminCommands")
class RemoveDisabledSessionCookieCmd extends AdminCmd<Void> {
    RemoveDisabledSessionCookieCmd() {
        super("removeDisabledSessionCookie")
    }

    /**
     * The Id of the cookie
     */
    def 'cookieId'(java.lang.String value) {
        parameter("cookieId", value)
    }

}
