/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove the given authentication provider(s) from the security configuration.
*/
@Generated("with GenerateAdminCommands")
class RemoveJaspiProviderCmd extends AdminCmd<Void> {
    RemoveJaspiProviderCmd() {
        super("removeJaspiProvider")
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
