/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns all the configured LDAP servers and their configurations.
*/
@Generated("with GenerateAdminCommands")
class GetIdMgrLDAPServerCmd extends AdminCmd<Void> {
    GetIdMgrLDAPServerCmd() {
        super("getIdMgrLDAPServer")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The host name for the LDAP server.
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
