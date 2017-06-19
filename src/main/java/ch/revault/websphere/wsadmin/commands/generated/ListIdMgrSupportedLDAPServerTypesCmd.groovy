/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns list of supported LDAP server types.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrSupportedLDAPServerTypesCmd extends AdminCmd<Void> {
    ListIdMgrSupportedLDAPServerTypesCmd() {
        super("listIdMgrSupportedLDAPServerTypes")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
