/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Unconfigures an inbound or outbound trusted realms by removing the realm object from the configuration.
*/
@Generated("with GenerateAdminCommands")
class UnconfigureTrustedRealmsCmd extends AdminCmd<Void> {
    UnconfigureTrustedRealmsCmd() {
        super("unconfigureTrustedRealms")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The type of trusted communication.  Valid values are inbound and outbound.
     */
    def 'communicationType'(String value) {
        parameter("communicationType", value)
    }

}
