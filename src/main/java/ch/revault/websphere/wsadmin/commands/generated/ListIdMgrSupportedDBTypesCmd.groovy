/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of supported database types.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrSupportedDBTypesCmd extends AdminCmd<Void> {
    ListIdMgrSupportedDBTypesCmd() {
        super("listIdMgrSupportedDBTypes")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
