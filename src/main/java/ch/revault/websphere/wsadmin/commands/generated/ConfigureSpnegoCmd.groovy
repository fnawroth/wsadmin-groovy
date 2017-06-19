/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command configures SPNEGO Web Authentication in the security configuration.
*/
@Generated("with GenerateAdminCommands")
class ConfigureSpnegoCmd extends AdminCmd<Void> {
    ConfigureSpnegoCmd() {
        super("configureSpnego")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Indicate whether or not enable SPNEGO Web authentication.
     */
    def 'enabled'(Boolean value) {
        parameter("enabled", value)
    }

    /**
     * Indicates whether or not to enable dynamic reload for SPNEGO Web authentication filters.
     */
    def 'dynamicReload'(Boolean value) {
        parameter("dynamicReload", value)
    }

    /**
     * Indicates whether or not to allow fall back to application authentication mechanism.
     */
    def 'allowAppAuthMethodFallback'(Boolean value) {
        parameter("allowAppAuthMethodFallback", value)
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

}
