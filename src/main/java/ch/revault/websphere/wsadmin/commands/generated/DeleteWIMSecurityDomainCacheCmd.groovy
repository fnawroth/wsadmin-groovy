/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the virtual member manager instance cached class loaded for the domain passed.
*/
@Generated("with GenerateAdminCommands")
class DeleteWIMSecurityDomainCacheCmd extends AdminCmd<Void> {
    DeleteWIMSecurityDomainCacheCmd() {
        super("deleteWIMSecurityDomainCache")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
