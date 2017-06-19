/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Return information about an authentication data entry
*/
@Generated("with GenerateAdminCommands")
class GetAuthDataEntryCmd extends AdminCmd<Void> {
    GetAuthDataEntryCmd() {
        super("getAuthDataEntry")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The alias of the auth data.
     */
    def 'alias'(String value) {
        parameter("alias", value)
    }

}
