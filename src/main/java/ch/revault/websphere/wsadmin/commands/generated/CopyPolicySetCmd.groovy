/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The copyPolicySet command creates a copy of an existing policy set. The default indicator is set to false for the new policy set. You may indicate whether to transfer attachments from the existing policy set to the new policy set.
*/
@Generated("with GenerateAdminCommands")
class CopyPolicySetCmd extends AdminCmd<Void> {
    CopyPolicySetCmd() {
        super("copyPolicySet")
    }

    /**
     * Specifies the name of the existing policy set. (String) 
     */
    def 'sourcePolicySet'(String value) {
        parameter("sourcePolicySet", value)
    }

    /**
     * Specifies the name of the new policy set. (String) 
     */
    def 'newPolicySet'(String value) {
        parameter("newPolicySet", value)
    }

    /**
     * Adds a description for the policy set or binding. (String) 
     */
    def 'newDescription'(String value) {
        parameter("newDescription", value)
    }

    /**
     * If this parameter is set to true, all attachments transfer from the source policy set to the new policy set. The default value is false. (Boolean)
     */
    def 'transferAttachments'(Boolean value) {
        parameter("transferAttachments", value)
    }

}
