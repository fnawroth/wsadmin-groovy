/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a descriptive property under an object.
*/
@Generated("with GenerateAdminCommands")
class DeleteDescriptivePropCmd extends AdminCmd<Void> {
    DeleteDescriptivePropCmd() {
        super("deleteDescriptiveProp")
    }

    /**
     * Specify the parent object data type of the descriptive property. Valid values are keyStores, trustStores, keyManagers and trustManagers.
     */
    def 'parentDataType'(String value) {
        parameter("parentDataType", value)
    }

    /**
     * Specify the parent object name of the descriptive property.
     */
    def 'parentClassName'(String value) {
        parameter("parentClassName", value)
    }

    /**
     * Specifies the management scope of the parent object.
     */
    def 'parentScopeName'(String value) {
        parameter("parentScopeName", value)
    }

    /**
     * Specifies the name of the descriptive property.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
