/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The addPolicyType command creates a policy type with default values for the specified policy set. You may indicate whether to enable or disable the added policy type.
*/
@Generated("with GenerateAdminCommands")
class AddPolicyTypeCmd extends AdminCmd<Void> {
    AddPolicyTypeCmd() {
        super("addPolicyType")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Specifies the name of the policy to add to the policy set. (String) 
     */
    def 'policyType'(String value) {
        parameter("policyType", value)
    }

    /**
     * If this parameter is set to true, the new policy type is enabled in the policy set. If this parameter is set to false, the configuration is contained within the policy set but the configuration does not have an effect on the system. (Boolean) 
     */
    def 'enabled'(Boolean value) {
        parameter("enabled", value)
    }

}
