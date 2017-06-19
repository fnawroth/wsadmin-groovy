/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns repository specific details for the repositories configuration for the specified realm.
*/
@Generated("with GenerateAdminCommands")
class GetIdMgrRepositoriesForRealmCmd extends AdminCmd<Void> {
    GetIdMgrRepositoriesForRealmCmd() {
        super("getIdMgrRepositoriesForRealm")
    }

    /**
     * Name of the realm.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
