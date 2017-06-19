/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the CSI outbound information for global security or in a security domain.
*/
@Generated("with GenerateAdminCommands")
class GetCSIOutboundInfoCmd extends AdminCmd<Void> {
    GetCSIOutboundInfoCmd() {
        super("getCSIOutboundInfo")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Display the model attribute values for the CSI inbound configuration.
     */
    def 'displayModel'(Boolean value) {
        parameter("displayModel", value)
    }

}
