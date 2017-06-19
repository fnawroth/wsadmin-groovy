/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The setPolicyTypeAttribute command sets an attribute for a specific policy.
*/
@Generated("with GenerateAdminCommands")
class SetPolicyTypeAttributeCmd extends AdminCmd<Void> {
    SetPolicyTypeAttributeCmd() {
        super("setPolicyTypeAttribute")
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
     * Specifies the name of the attribute of interest. (String)
     */
    def 'attributeName'(String value) {
        parameter("attributeName", value)
    }

    /**
     * Specifies the value of the attribute of interest. (String)
     */
    def 'attributeValue'(String value) {
        parameter("attributeValue", value)
    }

}
