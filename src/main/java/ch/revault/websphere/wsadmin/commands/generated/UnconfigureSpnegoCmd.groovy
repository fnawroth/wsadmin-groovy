/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command unconfigures SPNEGO Web authentication in the security configuration.
*/
@Generated("with GenerateAdminCommands")
class UnconfigureSpnegoCmd extends AdminCmd<Void> {
    UnconfigureSpnegoCmd() {
        super("unconfigureSpnego")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
