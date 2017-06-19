/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the global schema option for the data model in a multiple security domain environment, where global schema refers to the schema of the admin domain.
*/
@Generated("with GenerateAdminCommands")
class SetIdMgrUseGlobalSchemaForModelCmd extends AdminCmd<Void> {
    SetIdMgrUseGlobalSchemaForModelCmd() {
        super("setIdMgrUseGlobalSchemaForModel")
    }

    /**
     * A boolean to indicate whether the data model should use global schema. 
     */
    def 'useGlobalSchema'(Boolean value) {
        parameter("useGlobalSchema", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
