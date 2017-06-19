/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove realms from the trusted realm list
*/
@Generated("with GenerateAdminCommands")
class RemoveTrustedRealmsCmd extends AdminCmd<Void> {
    RemoveTrustedRealmsCmd() {
        super("removeTrustedRealms")
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
     * Removes a realm or list of realms from the list of trusted realms in a security domain or in global security.
     */
    def 'realmList'(String value) {
        parameter("realmList", value)
    }

}
