/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a policy that automatically activates all group members.
*/
@Generated("with GenerateAdminCommands")
class CreateAllActivePolicyCmd extends AdminCmd<Void> {
    CreateAllActivePolicyCmd() {
        super("createAllActivePolicy")
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

    /**
     * Specifies name and value pairs that determine which high availability groups are governed by this policy.
     */
    def 'matchCriteria'(java.util.Properties value) {
        parameter("matchCriteria", value)
    }

    /**
     * Specifies in seconds how frequently the high availability manager checks the health of the active group members governed by this policy.
     */
    def 'isAlive'(Integer value) {
        parameter("isAlive", value)
    }

    /**
     * A description for this policy.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Specifies additional custom properties for this policy.
     */
    def 'customProperties'(java.util.Properties value) {
        parameter("customProperties", value)
    }

    /**
     * Specifies whether or not quorum checking is enabled for a high availability group governed by this policy.
     */
    def 'quorum'(Boolean value) {
        parameter("quorum", value)
    }

}
