/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes the Jaspi configuration from a security domain.
*/
@Generated("with GenerateAdminCommands")
class UnconfigureJaspiCmd extends AdminCmd<Void> {
    UnconfigureJaspiCmd() {
        super("unconfigureJaspi")
    }

    /**
     * Specify the name of the security domain.
     */
    def 'securityDomainName'(java.lang.String value) {
        parameter("securityDomainName", value)
    }

}
