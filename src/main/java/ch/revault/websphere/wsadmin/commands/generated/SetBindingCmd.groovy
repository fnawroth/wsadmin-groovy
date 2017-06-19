/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The setBinding command updates the binding configuration for a specified policy type and scope. Use this command to add a server-specific binding, update an attachment to use a custom binding, edit binding attributes, or remove a binding.
*/
@Generated("with GenerateAdminCommands")
class SetBindingCmd extends AdminCmd<Void> {
    SetBindingCmd() {
        super("setBinding")
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
    def 'attributes'(java.util.Properties value) {
        parameter("attributes", value)
    }

    /**
     * Specifies the type of policy set attachments. The value for this parameter must be application, client, or system/trust. The default value is application. (String) 
     */
    def 'attachmentType'(String value) {
        parameter("attachmentType", value)
    }

    /**
     * Indicates whether the new attributes provided from the command replace the existing attributes. The default value is false. (Boolean) 
     */
    def 'replace'(Boolean value) {
        parameter("replace", value)
    }

    /**
     * Specifies whether to remove a server-specific default binding or to remove a custom binding from an attachment. You cannot remove a cell-level default binding. The default value is false. (Boolean) 
     */
    def 'remove'(Boolean value) {
        parameter("remove", value)
    }

    /**
     * Specifies the name for the binding. The binding name is optional when you are creating a new binding. A name is generated if it is not specified. The binding name is required when you are changing an attachment to use a different existing binding. (String) 
     */
    def 'bindingName'(String value) {
        parameter("bindingName", value)
    }

    /**
     * Specifies the scope of the binding. The binding scope is only required when you are changing an attachment to use an existing named binding or when you are removing a named binding from an attachment. (String) 
     */
    def 'bindingScope'(String value) {
        parameter("bindingScope", value)
    }

}
