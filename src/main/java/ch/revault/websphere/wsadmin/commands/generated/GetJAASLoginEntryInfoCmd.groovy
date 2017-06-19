/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get information about a JAAS login entry.
*/
@Generated("with GenerateAdminCommands")
class GetJAASLoginEntryInfoCmd extends AdminCmd<Void> {
    GetJAASLoginEntryInfoCmd() {
        super("getJAASLoginEntryInfo")
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

    /**
     * The alias name that identifies the login module entry.
     */
    def 'loginEntryAlias'(String value) {
        parameter("loginEntryAlias", value)
    }

}
