/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command displays the SPNEGO Web authentication Filter in the security configuration. If a host name is not specified, all the SPNEGO Web authentication Filters are displayed.
*/
@Generated("with GenerateAdminCommands")
class ShowSpnegoFilterCmd extends AdminCmd<Void> {
    ShowSpnegoFilterCmd() {
        super("showSpnegoFilter")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Supply a long host name.
     */
    def 'hostName'(String value) {
        parameter("hostName", value)
    }

}
