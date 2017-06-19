/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Validates the connection to the specified LDAP server.
*/
@Generated("with GenerateAdminCommands")
class ValidateLDAPConnectionCmd extends AdminCmd<Void> {
    ValidateLDAPConnectionCmd() {
        super("validateLDAPConnection")
    }

    /**
     * Name of LDAP host machine.
     */
    def 'hostname'(String value) {
        parameter("hostname", value)
    }

    /**
     * Port number of LDAP server.
     */
    def 'port'(Integer value) {
        parameter("port", value)
    }

    /**
     * Valid LDAP registry type.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * Base distinguished name.
     */
    def 'baseDN'(String value) {
        parameter("baseDN", value)
    }

    /**
     * Bind distinguished name.
     */
    def 'bindDN'(String value) {
        parameter("bindDN", value)
    }

    /**
     * Bind password.
     */
    def 'bindPassword'(String value) {
        parameter("bindPassword", value)
    }

    /**
     * SSL enabled status.
     */
    def 'sslEnabled'(Boolean value) {
        parameter("sslEnabled", value)
    }

    /**
     * SSL alias name.
     */
    def 'sslAlias'(String value) {
        parameter("sslAlias", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
