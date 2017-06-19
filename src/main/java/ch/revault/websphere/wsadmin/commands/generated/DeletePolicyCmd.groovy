/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a policy that matches the provided policy name.
*/
@Generated("with GenerateAdminCommands")
class DeletePolicyCmd extends AdminCmd<Void> {
    DeletePolicyCmd() {
        super("deletePolicy")
    }

    /**
     * The name of the core group which this policy applies to.
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

    /**
     * The name of the policy that task will create, modify, or delete.
     */
    def 'policyName'(String value) {
        parameter("policyName", value)
    }

}
