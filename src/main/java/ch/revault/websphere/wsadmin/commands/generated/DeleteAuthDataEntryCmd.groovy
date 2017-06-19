/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an authentication data entry from the administrative security configuration or a in a security domain.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuthDataEntryCmd extends AdminCmd<Void> {
    DeleteAuthDataEntryCmd() {
        super("deleteAuthDataEntry")
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
