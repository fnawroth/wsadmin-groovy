/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the configuration of the specified supported entity type.
*/
@Generated("with GenerateAdminCommands")
class GetIdMgrSupportedEntityTypeCmd extends AdminCmd<Void> {
    GetIdMgrSupportedEntityTypeCmd() {
        super("getIdMgrSupportedEntityType")
    }

    /**
     * The name of the supported entity type.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
