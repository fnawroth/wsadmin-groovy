/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getBinding command returns the binding configuration for a specified policy type and scope.
*/
@Generated("with GenerateAdminCommands")
class GetBindingCmd extends AdminCmd<Void> {
    GetBindingCmd() {
        super("getBinding")
    }

    /**
     * Specifies the name of the policy to add to the policy set. (String) 
     */
    def 'policyType'(String value) {
        parameter("policyType", value)
    }

    /**
     * Specifies the location of the binding. This value could be the cell-wide default binding, server-specific default binding, or attachment-specific binding. (Properties)
     */
    def 'bindingLocation'(java.util.Properties value) {
        parameter("bindingLocation", value)
    }

    /**
     * Specifies the attribute values to update. If the attributes parameter is not specified, the command only updates the binding location used by the specified attachment. (Properties) 
     */
    def 'attributes'(java.lang.String[] value) {
        parameter("attributes", value)
    }

    /**
     * Specifies the type of policy set attachments. The value for this parameter must be application, client, or system/trust. The default value is application. (String) 
     */
    def 'attachmentType'(String value) {
        parameter("attachmentType", value)
    }

    /**
     * Specifies the name for the binding. The binding name is optional when you are creating a new binding. A name is generated if it is not specified. The binding name is required when you are changing an attachment to use a different existing binding. (String) 
     */
    def 'bindingName'(String value) {
        parameter("bindingName", value)
    }

}
