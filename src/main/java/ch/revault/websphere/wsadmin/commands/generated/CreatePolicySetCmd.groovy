/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The createPolicySet command creates a new policy set. Policy types are not created with the policy set. The default indicator is set to false.
*/
@Generated("with GenerateAdminCommands")
class CreatePolicySetCmd extends AdminCmd<Void> {
    CreatePolicySetCmd() {
        super("createPolicySet")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Adds a description for the policy set. (String) 
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Specifies the type of policy set. Specify application to list application policy sets. Specify system/trust to list the trust service policy sets. The default value for this parameter is application. (String) 
     */
    def 'policySetType'(String value) {
        parameter("policySetType", value)
    }

}
