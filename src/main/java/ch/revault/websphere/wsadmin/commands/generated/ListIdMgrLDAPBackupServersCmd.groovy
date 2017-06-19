/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the backup LDAP servers.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrLDAPBackupServersCmd extends AdminCmd<Void> {
    ListIdMgrLDAPBackupServersCmd() {
        super("listIdMgrLDAPBackupServers")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Primary host of the LDAP server.
     */
    def 'primary_host'(String value) {
        parameter("primary_host", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
