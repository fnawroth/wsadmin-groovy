/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Performs ldapsearch according to search criteria from input parameter 
*/
@Generated("with GenerateAdminCommands")
class LdapSearchCmd extends AdminCmd<Void> {
    LdapSearchCmd() {
        super("ldapSearch")
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
     * Ldapsearch search filter.
     */
    def 'searchFilter'(String value) {
        parameter("searchFilter", value)
    }

    /**
     * Maximum number of search output. 
     */
    def 'searchLimit'(Integer value) {
        parameter("searchLimit", value)
    }

    /**
     * Specifies the Ldapearch referral option.
     */
    def 'referral'(String value) {
        parameter("referral", value)
    }

    /**
     * Specifies the Ldapsearch search scope option.
     */
    def 'searchScope'(String value) {
        parameter("searchScope", value)
    }

    /**
     * Produces the verbose output.
     */
    def 'verbose'(Boolean value) {
        parameter("verbose", value)
    }

}
