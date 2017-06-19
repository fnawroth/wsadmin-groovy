/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The deletePolicySet command deletes the specified policy set. If attachments exist for the policy set, the command returns a failure message.
*/
@Generated("with GenerateAdminCommands")
class DeletePolicySetCmd extends AdminCmd<Void> {
    DeletePolicySetCmd() {
        super("deletePolicySet")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

}
