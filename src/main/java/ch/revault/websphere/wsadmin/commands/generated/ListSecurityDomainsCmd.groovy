/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all security domains.
*/
@Generated("with GenerateAdminCommands")
class ListSecurityDomainsCmd extends AdminCmd<Void> {
    ListSecurityDomainsCmd() {
        super("listSecurityDomains")
    }

    /**
     * Specify true to include the description of each security domain in the list returned false to just return the names of the security domains.
     */
    def 'listDescription'(Boolean value) {
        parameter("listDescription", value)
    }

    /**
     * Specify true to not include the special domains in the list of security domains returned and false to display the special domains.
     */
    def 'doNotDisplaySpecialDomains'(Boolean value) {
        parameter("doNotDisplaySpecialDomains", value)
    }

}
