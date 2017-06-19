/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The setPolicyType command updates the attributes of a specified policy.
*/
@Generated("with GenerateAdminCommands")
class SetPolicyTypeCmd extends AdminCmd<Void> {
    SetPolicyTypeCmd() {
        super("setPolicyType")
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
     * Specifies the attributes to update. (Properties) 
     */
    def 'attributes'(java.util.Properties value) {
        parameter("attributes", value)
    }

    /**
     * Indicates whether the new attributes provided from the command replace the existing attributes. The default value is false. (Boolean) 
     */
    def 'replace'(Boolean value) {
        parameter("replace", value)
    }

}
