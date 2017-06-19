/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the primary LDAP server and configured backup servers.
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrLDAPServerCmd extends AdminCmd<Void> {
    DeleteIdMgrLDAPServerCmd() {
        super("deleteIdMgrLDAPServer")
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
