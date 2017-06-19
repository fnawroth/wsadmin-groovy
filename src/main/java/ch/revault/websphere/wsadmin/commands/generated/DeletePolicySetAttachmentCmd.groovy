/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The deletePolicySetAttachment command removes a policy set attachment.
*/
@Generated("with GenerateAdminCommands")
class DeletePolicySetAttachmentCmd extends AdminCmd<Void> {
    DeletePolicySetAttachmentCmd() {
        super("deletePolicySetAttachment")
    }

    /**
     * Specifies the name of the application. This parameter applies to application and client attachments.  It is not applicable to trust service attachments. (String) 
     */
    def 'applicationName'(String value) {
        parameter("applicationName", value)
    }

    /**
     * Specifies the ID of the attachment. (String) 
     */
    def 'attachmentId'(String value) {
        parameter("attachmentId", value)
    }

    /**
     * Specifies the type of policy set attachments. The value for this parameter must be application, client, or system/trust. The default value is application. (String) 
     */
    def 'attachmentType'(String value) {
        parameter("attachmentType", value)
    }

    /**
     * The attachment specific properties (Properties)
     */
    def 'attachmentProperties'(java.util.Properties value) {
        parameter("attachmentProperties", value)
    }

}
