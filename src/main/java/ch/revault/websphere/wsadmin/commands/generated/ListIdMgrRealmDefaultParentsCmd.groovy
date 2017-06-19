/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the mapping of default parent uniqueName for all entity types in a specified realm. If realm name is not specified, default realm is used.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrRealmDefaultParentsCmd extends AdminCmd<Void> {
    ListIdMgrRealmDefaultParentsCmd() {
        super("listIdMgrRealmDefaultParents")
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
