/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getPolicySetAttachments command lists the properties for all attachments configured for a specified application or for the trust service.
*/
@Generated("with GenerateAdminCommands")
class GetPolicySetAttachmentsCmd extends AdminCmd<Void> {
    GetPolicySetAttachmentsCmd() {
        super("getPolicySetAttachments")
    }

    /**
     * Specifies the name of the application. This parameter applies to application and client attachments.  It is not applicable to trust service attachments. (String) 
     */
    def 'applicationName'(String value) {
        parameter("applicationName", value)
    }

    /**
     * Specifies the type of policy set attachments. The value for this parameter must be application, client, or system/trust. The default value is application. (String) 
     */
    def 'attachmentType'(String value) {
        parameter("attachmentType", value)
    }

    /**
     * Provides expanded information that details the attachment properties for each resource. An asterisk (*) character returns all Web services. (String) 
     */
    def 'expandResources'(String value) {
        parameter("expandResources", value)
    }

    /**
     * The attachment specific properties (Properties)
     */
    def 'attachmentProperties'(java.util.Properties value) {
        parameter("attachmentProperties", value)
    }

    /**
     * Specifies the name of the service reference for which the attachments are returned. (String) 
     */
    def 'serviceRef'(String value) {
        parameter("serviceRef", value)
    }

}
