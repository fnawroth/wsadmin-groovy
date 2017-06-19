/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the configured supported entity types.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrSupportedEntityTypesCmd extends AdminCmd<Void> {
    ListIdMgrSupportedEntityTypesCmd() {
        super("listIdMgrSupportedEntityTypes")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
