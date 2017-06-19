/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Dynamically updates the LDAP server bind information. If bindDN is specified bindPassword must be specified. If only id is specified then LDAP server information is refreshed.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrLDAPBindInfoCmd extends AdminCmd<Void> {
    UpdateIdMgrLDAPBindInfoCmd() {
        super("updateIdMgrLDAPBindInfo")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The binding distinguished name for the LDAP server.
     */
    def 'bindDN'(String value) {
        parameter("bindDN", value)
    }

    /**
     * The LDAP server binding password.
     */
    def 'bindPassword'(String value) {
        parameter("bindPassword", value)
    }

}
