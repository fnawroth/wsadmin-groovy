/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a realm or list of realms to the list of trusted realms in a security domain or in global security.
*/
@Generated("with GenerateAdminCommands")
class AddTrustedRealmsCmd extends AdminCmd<Void> {
    AddTrustedRealmsCmd() {
        super("addTrustedRealms")
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

    /**
     * A pipe separated list of realm names to add the trusted realm list.
     */
    def 'realmList'(String value) {
        parameter("realmList", value)
    }

}
