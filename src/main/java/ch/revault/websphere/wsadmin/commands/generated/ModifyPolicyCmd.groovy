/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a policy that matches the provided policy name.
*/
@Generated("with GenerateAdminCommands")
class ModifyPolicyCmd extends AdminCmd<Void> {
    ModifyPolicyCmd() {
        super("modifyPolicy")
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
     * Policy name
     */
    def 'newPolicyName'(String value) {
        parameter("newPolicyName", value)
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
     * Specifies whether or not quorum checking is enabled for a high availability group governed by this policy.
     */
    def 'quorum'(Boolean value) {
        parameter("quorum", value)
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
     * Specifies the number of group members to activate at startup.
     */
    def 'numActive'(Integer value) {
        parameter("numActive", value)
    }

    /**
     * Specifies whether group members are activated only on servers from the list of preferred servers.
     */
    def 'preferredOnly'(Boolean value) {
        parameter("preferredOnly", value)
    }

    /**
     * Specifies whether active group members are moved to the most preferred server at any given time.
     */
    def 'failBack'(Boolean value) {
        parameter("failBack", value)
    }

    /**
     * Specifies a list of core group servers for this policy.
     */
    def 'serversList'(java.lang.String[] value) {
        parameter("serversList", value)
    }

}
