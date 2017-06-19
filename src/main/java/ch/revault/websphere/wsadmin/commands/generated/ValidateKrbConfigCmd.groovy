/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Validates the Kerberos configuration data either in the global security configuration file security.xml or specified as an input parameters. 
*/
@Generated("with GenerateAdminCommands")
class ValidateKrbConfigCmd extends AdminCmd<Void> {
    ValidateKrbConfigCmd() {
        super("validateKrbConfig")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Check without validate of the Kerberos configuration, must use Global security for this check.
     */
    def 'checkConfigOnly'(Boolean value) {
        parameter("checkConfigOnly", value)
    }

    /**
     * Using the Global Security configuration (security.xml) data instead of input parameters.
     */
    def 'useGlobalSecurityConfig'(Boolean value) {
        parameter("useGlobalSecurityConfig", value)
    }

    /**
     * Validate the Kerberos realm against the default Kerberos realm in the Kerberos configuration file (krb5.ini/krb5.conf).
     */
    def 'validateKrbRealm'(Boolean value) {
        parameter("validateKrbRealm", value)
    }

    /**
     * Server identity used for internal process communications
     */
    def 'serverId'(String value) {
        parameter("serverId", value)
    }

    /**
     * Specifies the password that is used for the server identity.
     */
    def 'serverIdPassword'(String value) {
        parameter("serverIdPassword", value)
    }

    /**
     * Specifies the Kerberos service principal name in the Kerberos keytab file.
     */
    def 'krb5Spn'(String value) {
        parameter("krb5Spn", value)
    }

    /**
     * Supply directory location and file name of the configuration (krb5.ini or krb5.conf) file.
     */
    def 'krb5Config'(String value) {
        parameter("krb5Config", value)
    }

    /**
     * Supply directory location and file name of the Kerberos keytab file.
     */
    def 'krb5Keytab'(String value) {
        parameter("krb5Keytab", value)
    }

    /**
     * Supply value for Kerberos realm name.
     */
    def 'krb5Realm'(String value) {
        parameter("krb5Realm", value)
    }

}
