/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getPolicyType command returns the attributes for a specified policy.
*/
@Generated("with GenerateAdminCommands")
class GetPolicyTypeCmd extends AdminCmd<Void> {
    GetPolicyTypeCmd() {
        super("getPolicyType")
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
     * Specifies the attributes to display. If this parameter is used, the command returns all attributes for the specified policy type. (String[]) 
     */
    def 'attributes'(java.lang.String[] value) {
        parameter("attributes", value)
    }

    /**
     * Indicates if the command should use the default repository (Boolean)
     */
    def 'fromDefaultRepository'(Boolean value) {
        parameter("fromDefaultRepository", value)
    }

}
