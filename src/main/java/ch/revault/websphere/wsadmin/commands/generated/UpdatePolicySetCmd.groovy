/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The updatePolicySet command enables you to input an attribute list to update the policy set. You can use this command to update all attributes for the policy set, or a subset of attributes.
*/
@Generated("with GenerateAdminCommands")
class UpdatePolicySetCmd extends AdminCmd<Void> {
    UpdatePolicySetCmd() {
        super("updatePolicySet")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Specifies a properties object that contains the attributes to update for the specified policy set. (Properties)
     */
    def 'attributes'(java.util.Properties value) {
        parameter("attributes", value)
    }

}
