/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Retrieves the supported data types. If repository ID is not specified then it returns the default data types supported by virtual member manager.
*/
@Generated("with GenerateAdminCommands")
class GetIdMgrSupportedDataTypesCmd extends AdminCmd<Void> {
    GetIdMgrSupportedDataTypesCmd() {
        super("getIdMgrSupportedDataTypes")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
