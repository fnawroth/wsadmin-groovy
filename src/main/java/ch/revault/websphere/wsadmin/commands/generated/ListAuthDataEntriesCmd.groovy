/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List authentication data entries in the administrative security configuration or a in a security domain. 
*/
@Generated("with GenerateAdminCommands")
class ListAuthDataEntriesCmd extends AdminCmd<Void> {
    ListAuthDataEntriesCmd() {
        super("listAuthDataEntries")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
