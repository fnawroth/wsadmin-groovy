/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Display the names of all authentication providers in the security configuration.
*/
@Generated("with GenerateAdminCommands")
class DisplayJaspiProviderNamesCmd extends AdminCmd<Void> {
    DisplayJaspiProviderNamesCmd() {
        super("displayJaspiProviderNames")
    }

    /**
     * Specify the name of the security domain.
     */
    def 'securityDomainName'(java.lang.String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Display the effective Jaspi provider names when getting the list of provider names for a security domain.
     */
    def 'getEffectiveProviderNames'(java.lang.Boolean value) {
        parameter("getEffectiveProviderNames", value)
    }

}
