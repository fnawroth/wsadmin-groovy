/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Display configuration data for the given authentication provider(s).
*/
@Generated("with GenerateAdminCommands")
class DisplayJaspiProviderCmd extends AdminCmd<Void> {
    DisplayJaspiProviderCmd() {
        super("displayJaspiProvider")
    }

    /**
     * Specify the name of the security domain.
     */
    def 'securityDomainName'(java.lang.String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify one or more authentication provider names.
     */
    def 'providerName'(java.lang.String[] value) {
        parameter("providerName", value)
    }

}
