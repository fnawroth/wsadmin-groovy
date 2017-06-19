/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The transferAttachmentsForPolicySet command transfers all attachments from one policy set to another policy set.
*/
@Generated("with GenerateAdminCommands")
class TransferAttachmentsForPolicySetCmd extends AdminCmd<Void> {
    TransferAttachmentsForPolicySetCmd() {
        super("transferAttachmentsForPolicySet")
    }

    /**
     * Specifies the name of the existing policy set. (String) 
     */
    def 'sourcePolicySet'(String value) {
        parameter("sourcePolicySet", value)
    }

    /**
     * Specifies the name of the policy set to which the attachments are copied. (String) 
     */
    def 'destinationPolicySet'(String value) {
        parameter("destinationPolicySet", value)
    }

    /**
     * Specifies the name of the application. This parameter applies to application and client attachments.  It is not applicable to trust service attachments. (String) 
     */
    def 'applicationName'(String value) {
        parameter("applicationName", value)
    }

    /**
     * The attachment specific properties (Properties)
     */
    def 'attachmentProperties'(java.util.Properties value) {
        parameter("attachmentProperties", value)
    }

}
