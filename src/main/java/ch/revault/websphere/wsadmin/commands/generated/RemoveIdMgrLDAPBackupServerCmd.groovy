/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes a backup LDAP server.
*/
@Generated("with GenerateAdminCommands")
class RemoveIdMgrLDAPBackupServerCmd extends AdminCmd<Void> {
    RemoveIdMgrLDAPBackupServerCmd() {
        super("removeIdMgrLDAPBackupServer")
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

    /**
     * The port number for the LDAP server.
     */
    def 'port'(Integer value) {
        parameter("port", value)
    }

}
