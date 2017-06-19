/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configure the security level for a secure proxy or management server.
*/
@Generated("with GenerateAdminCommands")
class SetServerSecurityLevelCmd extends AdminCmd<Void> {
    SetServerSecurityLevelCmd() {
        super("setServerSecurityLevel")
    }

    /**
     * Specifies the level of security to apply to the proxy server.
     */
    def 'proxySecurityLevel'(java.lang.String value) {
        parameter("proxySecurityLevel", value)
    }

}
