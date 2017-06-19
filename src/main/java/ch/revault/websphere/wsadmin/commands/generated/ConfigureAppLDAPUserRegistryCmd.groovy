/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures an LDAP user registry in an application security domain
*/
@Generated("with GenerateAdminCommands")
class ConfigureAppLDAPUserRegistryCmd extends AdminCmd<Void> {
    ConfigureAppLDAPUserRegistryCmd() {
        super("configureAppLDAPUserRegistry")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Name of the realm.
     */
    def 'realmName'(String value) {
        parameter("realmName", value)
    }

    /**
     * Specifies that a case-insensitive authorization check be performed: true/false.
     */
    def 'ignoreCase'(Boolean value) {
        parameter("ignoreCase", value)
    }

    /**
     * Check that the user registry is configured correctly to perform user registry lookups.
     */
    def 'verifyRegistry'(Boolean value) {
        parameter("verifyRegistry", value)
    }

    /**
     * Supply a valid LDAP Server type.  Valid values are: IBM_DIRECTORY_SERVER, IPLANET, NETSCAPE, NDS, DOMINO502, SECUREWAY, ACTIVE_DIRECTORY, CUSTOM
     */
    def 'ldapServerType'(String value) {
        parameter("ldapServerType", value)
    }

    /**
     * Supply a valid LDAP host name for the LDAP server.
     */
    def 'ldapHost'(String value) {
        parameter("ldapHost", value)
    }

    /**
     * Supply a valid port number for the LDAP server.
     */
    def 'ldapPort'(String value) {
        parameter("ldapPort", value)
    }

    /**
     * Supply a valid LDAP base distinguished name.
     */
    def 'baseDN'(String value) {
        parameter("baseDN", value)
    }

    /**
     * Supply a valid LDAP bind distinguished name.
     */
    def 'bindDN'(String value) {
        parameter("bindDN", value)
    }

    /**
     * Supply a valid LDAP bind password.
     */
    def 'bindPassword'(String value) {
        parameter("bindPassword", value)
    }

    /**
     * Specifies the timeout value, in seconds, for an LDAP server to respond before canceling a request.
     */
    def 'searchTimeout'(Long value) {
        parameter("searchTimeout", value)
    }

    /**
     * Specifies, by default, that the application server reuses the LDAP connection.
     */
    def 'reuseConnection'(Boolean value) {
        parameter("reuseConnection", value)
    }

    /**
     * Specifies an LDAP filter clause for searching the user registry for users.
     */
    def 'userFilter'(String value) {
        parameter("userFilter", value)
    }

    /**
     * Specifies an LDAP filter clause for searching the user registry for groups.
     */
    def 'groupFilter'(String value) {
        parameter("groupFilter", value)
    }

    /**
     * Specifies an LDAP filter that maps the short name of a user to an LDAP entry.
     */
    def 'userIdMap'(String value) {
        parameter("userIdMap", value)
    }

    /**
     * Specifies an LDAP filter that maps the short name of a group to an LDAP entry.
     */
    def 'groupIdMap'(String value) {
        parameter("groupIdMap", value)
    }

    /**
     * Specifies an LDAP filter that identifies user to group memberships.
     */
    def 'groupMemberIdMap'(String value) {
        parameter("groupMemberIdMap", value)
    }

    /**
     * Specifies whether to map X.509 certificates into an LDAP directory by EXACT_DN or CERTIFICATE_FILTER. Specify CERTIFICATE_FILTER to use the specified certificate filter for the mapping.
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
     * The kerberos user filter used to search for users when kerberos authentication mechanism is enabled.
     */
    def 'krbUserFilter'(String value) {
        parameter("krbUserFilter", value)
    }

    /**
     * Specify true to perform a recursive nested group search and false not to perform a recursive nested group search.
     */
    def 'nestedGroupSearch'(Boolean value) {
        parameter("nestedGroupSearch", value)
    }

    /**
     * SSL enabled status.
     */
    def 'sslEnabled'(Boolean value) {
        parameter("sslEnabled", value)
    }

    /**
     * SSL configuration to use for a security LDAP connection.
     */
    def 'sslConfig'(String value) {
        parameter("sslConfig", value)
    }

    /**
     * Specify true to reset the filters to the default set of filter values for the LDAP server type.
     */
    def 'resetDefaultFilters'(Boolean value) {
        parameter("resetDefaultFilters", value)
    }

    /**
     * Add, modify, or remove custom properties on the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

}
