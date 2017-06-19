/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a boolean to indicate whether the global schema option is enabled for the data model in a multiple security domain environment.
*/
@Generated("with GenerateAdminCommands")
class IsIdMgrUseGlobalSchemaForModelCmd extends AdminCmd<Void> {
    IsIdMgrUseGlobalSchemaForModelCmd() {
        super("isIdMgrUseGlobalSchemaForModel")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
