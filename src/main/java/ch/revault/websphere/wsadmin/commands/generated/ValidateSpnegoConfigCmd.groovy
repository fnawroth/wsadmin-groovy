/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Validates the SPNEGO Web authentication configuration. 
*/
@Generated("with GenerateAdminCommands")
class ValidateSpnegoConfigCmd extends AdminCmd<Void> {
    ValidateSpnegoConfigCmd() {
        super("validateSpnegoConfig")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
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
