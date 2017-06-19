/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes the external JAAC authorization provider
*/
@Generated("with GenerateAdminCommands")
class UnconfigureAuthzConfigCmd extends AdminCmd<Void> {
    UnconfigureAuthzConfigCmd() {
        super("unconfigureAuthzConfig")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
