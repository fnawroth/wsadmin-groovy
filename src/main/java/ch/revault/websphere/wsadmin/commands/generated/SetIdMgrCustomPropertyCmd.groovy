/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets/adds/deletes custom property to a repository configuration. If value is not specified or an empty string then the property will be deleted from the repository configuration. If name does not exist then it will be added, if a value is specified. If name is "*" then all the custom properties will be deleted.
*/
@Generated("with GenerateAdminCommands")
class SetIdMgrCustomPropertyCmd extends AdminCmd<Void> {
    SetIdMgrCustomPropertyCmd() {
        super("setIdMgrCustomProperty")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Name of a property for the repository
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

    /**
     * Value of a property for the repository
     */
    def 'value'(String value) {
        parameter("value", value)
    }

}
