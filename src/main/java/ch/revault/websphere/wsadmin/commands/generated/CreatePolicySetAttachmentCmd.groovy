/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The createPolicySetAttachment command creates a new policy set attachment.
*/
@Generated("with GenerateAdminCommands")
class CreatePolicySetAttachmentCmd extends AdminCmd<Void> {
    CreatePolicySetAttachmentCmd() {
        super("createPolicySetAttachment")
    }

    /**
     * Specifies the name of the application. This parameter applies to application and client attachments.  It is not applicable to trust service attachments. (String) 
     */
    def 'applicationName'(String value) {
        parameter("applicationName", value)
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Specifies the names of the application or trust service resources. (String) 
     */
    def 'resources'(java.lang.String[] value) {
        parameter("resources", value)
    }

    /**
     * Specifies the type of policy set attachments. The value for this parameter must be application, client, or system/trust. The default value is application. (String) 
     */
    def 'attachmentType'(String value) {
        parameter("attachmentType", value)
    }

    /**
     * Indicates that the client resources should not be validated.  The default value for this parameter is false. (Boolean)
     */
    def 'dynamicClient'(Boolean value) {
        parameter("dynamicClient", value)
    }

    /**
     * The attachment specific properties (Properties)
     */
    def 'attachmentProperties'(java.util.Properties value) {
        parameter("attachmentProperties", value)
    }

    /**
     * Indicates if the service reference should inherit the policy set attachment of the service. (Boolean) 
     */
    def 'inheritFromService'(Boolean value) {
        parameter("inheritFromService", value)
    }

}
