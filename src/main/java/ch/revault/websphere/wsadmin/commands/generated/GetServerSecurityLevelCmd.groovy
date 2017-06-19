/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the current security level of the secure proxy server.
*/
@Generated("with GenerateAdminCommands")
class GetServerSecurityLevelCmd extends AdminCmd<Void> {
    GetServerSecurityLevelCmd() {
        super("getServerSecurityLevel")
    }

    /**
     * Displays additional information about the configured security level of the proxy server.
     */
    def 'proxyDetailsFormat'(java.lang.String value) {
        parameter("proxyDetailsFormat", value)
    }

}
