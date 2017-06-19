/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The listPolicyTypes command returns a list of the names of the policies configured in the system, in a policy set, or in a binding.
*/
@Generated("with GenerateAdminCommands")
class ListPolicyTypesCmd extends AdminCmd<Void> {
    ListPolicyTypesCmd() {
        super("listPolicyTypes")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Specifies the location of the binding. This value could be the cell-wide default binding, server-specific default binding, or attachment-specific binding. (Properties)
     */
    def 'bindingLocation'(java.util.Properties value) {
        parameter("bindingLocation", value)
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

    /**
     * Indicates if the command should use the default repository (Boolean)
     */
    def 'fromDefaultRepository'(Boolean value) {
        parameter("fromDefaultRepository", value)
    }

    /**
     * If this parameter is set to true, only the policy types that are enabled in the policy set are listed. If this parameter is set to false, all of the policy types in the policy set are listed. (Boolean) 
     */
    def 'enabled'(Boolean value) {
        parameter("enabled", value)
    }

}
