/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getPolicySet command returns general attributes, such as description and default indicator, for the specified policy set.
*/
@Generated("with GenerateAdminCommands")
class GetPolicySetCmd extends AdminCmd<Void> {
    GetPolicySetCmd() {
        super("getPolicySet")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Indicates if the command should use the default repository (Boolean)
     */
    def 'fromDefaultRepository'(Boolean value) {
        parameter("fromDefaultRepository", value)
    }

}
