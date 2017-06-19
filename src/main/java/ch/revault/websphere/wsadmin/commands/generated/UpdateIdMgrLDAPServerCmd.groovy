/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates an LDAP server configuration of the LDAP repository configuration.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrLDAPServerCmd extends AdminCmd<Void> {
    UpdateIdMgrLDAPServerCmd() {
        super("updateIdMgrLDAPServer")
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

    /**
     * The port number for the LDAP server.
     */
    def 'port'(Integer value) {
        parameter("port", value)
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

    /**
     * The authentication method to use.
     */
    def 'authentication'(String value) {
        parameter("authentication", value)
    }

    /**
     * LDAP referral
     */
    def 'referal'(String value) {
        parameter("referal", value)
    }

    /**
     * Controls how aliases are dereferenced. Possible values are always(default), never, finding, and searching.
     */
    def 'derefAliases'(String value) {
        parameter("derefAliases", value)
    }

    /**
     * Enable Secure Sockets Layer (SSL) for the LDAP server.
     */
    def 'sslEnabled'(Boolean value) {
        parameter("sslEnabled", value)
    }

    /**
     * LDAP connection pool
     */
    def 'connectionPool'(Boolean value) {
        parameter("connectionPool", value)
    }

    /**
     * Connection timeout(in seconds)
     */
    def 'connectTimeout'(Integer value) {
        parameter("connectTimeout", value)
    }

    /**
     * The type of LDAP server used.
     */
    def 'ldapServerType'(String value) {
        parameter("ldapServerType", value)
    }

    /**
     * Secure Sockets Layer (SSL) configuration
     */
    def 'sslConfiguration'(String value) {
        parameter("sslConfiguration", value)
    }

    /**
     * Specifies whether to map X.509 certificates into an LDAP directory by exact distinguished name or certificate filter. Specify the certificate filter to use the specified certificate filter for the mapping.
     */
    def 'certificateMapMode'(String value) {
        parameter("certificateMapMode", value)
    }

    /**
     * If you specify the certificate map mode, use this property to specify the LDAP filter, which maps attributes in the client certificate to entries in LDAP.
     */
    def 'certificateFilter'(String value) {
        parameter("certificateFilter", value)
    }

    /**
     * Primary host of the LDAP server.
     */
    def 'primary_host'(String value) {
        parameter("primary_host", value)
    }

}
