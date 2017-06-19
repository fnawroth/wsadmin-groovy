/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command removes SPNEGO Web authentication Filter from the security configuration. If a host name is not specified, all the SPNEGO Web authentication Filters are removed.
*/
@Generated("with GenerateAdminCommands")
class DeleteSpnegoFilterCmd extends AdminCmd<Void> {
    DeleteSpnegoFilterCmd() {
        super("deleteSpnegoFilter")
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
