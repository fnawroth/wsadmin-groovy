/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates an LDAP repository configuration.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrLDAPRepositoryCmd extends AdminCmd<Void> {
    UpdateIdMgrLDAPRepositoryCmd() {
        super("updateIdMgrLDAPRepository")
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
     * The implementation class name for the repository adapter.
     */
    def 'adapterClassName'(String value) {
        parameter("adapterClassName", value)
    }

    /**
     * A boolean representing if the repository supports paging
     */
    def 'supportPaging'(Boolean value) {
        parameter("supportPaging", value)
    }

    /**
     * A boolean representing if the repository supports sorting
     */
    def 'supportSorting'(Boolean value) {
        parameter("supportSorting", value)
    }

    /**
     * A boolean representing if the repository supports transactions
     */
    def 'supportTransactions'(Boolean value) {
        parameter("supportTransactions", value)
    }

    /**
     * A boolean representing if the external ID for entities in the repository is unique
     */
    def 'isExtIdUnique'(Boolean value) {
        parameter("isExtIdUnique", value)
    }

    /**
     * A boolean representing if the repository supports external names
     */
    def 'supportExternalName'(Boolean value) {
        parameter("supportExternalName", value)
    }

    /**
     * A boolean representing if the adapter supports asynchronous mode
     */
    def 'supportAsyncMode'(Boolean value) {
        parameter("supportAsyncMode", value)
    }

    /**
     * The type of LDAP server used.
     */
    def 'ldapServerType'(String value) {
        parameter("ldapServerType", value)
    }

    /**
     * Whether or not to translate the RDN when the LDAP distinguished name uses an RDN that is different from the virtual member manager default RDN for an entity.
     */
    def 'translateRDN'(Boolean value) {
        parameter("translateRDN", value)
    }

    /**
     * Set how long until a search terminates.
     */
    def 'searchTimeLimit'(Integer value) {
        parameter("searchTimeLimit", value)
    }

    /**
     * The maximum number of results returned from a search.
     */
    def 'searchCountLimit'(Integer value) {
        parameter("searchCountLimit", value)
    }

    /**
     * The size of a page returned from a search.
     */
    def 'searchPageSize'(Integer value) {
        parameter("searchPageSize", value)
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
     * A semicolon separated list of virtual member manager properties that can be used for login. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'loginProperties'(String value) {
        parameter("loginProperties", value)
    }

    /**
     * Return to the primary LDAP server when available
     */
    def 'returnToPrimaryServer'(Boolean value) {
        parameter("returnToPrimaryServer", value)
    }

    /**
     * Polling interval for testing the primary server availability(in minutes)
     */
    def 'primaryServerQueryTimeInterval'(Integer value) {
        parameter("primaryServerQueryTimeInterval", value)
    }

    /**
     * A string representing the type of support for change tracking. Acceptable values include 'none', 'native'.
     */
    def 'supportChangeLog'(String value) {
        parameter("supportChangeLog", value)
    }

}
