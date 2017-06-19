/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a security domain by copy the global administrative security configuration.
*/
@Generated("with GenerateAdminCommands")
class CopySecurityDomainFromGlobalSecurityCmd extends AdminCmd<Void> {
    CopySecurityDomainFromGlobalSecurityCmd() {
        super("copySecurityDomainFromGlobalSecurity")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Description of the security domain.
     */
    def 'securityDomainDescription'(String value) {
        parameter("securityDomainDescription", value)
    }

    /**
     * If an active user registry is defined then a new realm name must be used in the new security domain.
     */
    def 'realmName'(String value) {
        parameter("realmName", value)
    }

}
