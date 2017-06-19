/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists names, types, and hostnames of all the configured repositories.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrRepositoriesCmd extends AdminCmd<Void> {
    ListIdMgrRepositoriesCmd() {
        super("listIdMgrRepositories")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
