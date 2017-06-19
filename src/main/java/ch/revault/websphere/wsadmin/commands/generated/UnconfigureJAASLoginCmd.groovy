/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Unconfigures a JAAS login in an application security domain.  This removes the JAAS login object and all it's entries.
*/
@Generated("with GenerateAdminCommands")
class UnconfigureJAASLoginCmd extends AdminCmd<Void> {
    UnconfigureJAASLoginCmd() {
        super("unconfigureJAASLogin")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specifies the login module type.  Valid values are: system, application
     */
    def 'loginType'(String value) {
        parameter("loginType", value)
    }

}
