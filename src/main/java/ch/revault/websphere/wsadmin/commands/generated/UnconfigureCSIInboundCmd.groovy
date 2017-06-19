/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes CSI inbound information from an application security domain.
*/
@Generated("with GenerateAdminCommands")
class UnconfigureCSIInboundCmd extends AdminCmd<Void> {
    UnconfigureCSIInboundCmd() {
        super("unconfigureCSIInbound")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
