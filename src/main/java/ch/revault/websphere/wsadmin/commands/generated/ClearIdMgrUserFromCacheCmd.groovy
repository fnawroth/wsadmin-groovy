/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a specified user from the cache.
*/
@Generated("with GenerateAdminCommands")
class ClearIdMgrUserFromCacheCmd extends AdminCmd<Void> {
    ClearIdMgrUserFromCacheCmd() {
        super("clearIdMgrUserFromCache")
    }

    /**
     * The principal name of a PersonAccount.
     */
    def 'principalName'(String value) {
        parameter("principalName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
