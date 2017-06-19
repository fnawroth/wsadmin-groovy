/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getClientDynamicPolicyControl command returns the WSPolicy client acquisition information for a specified application or resource.
*/
@Generated("with GenerateAdminCommands")
class GetClientDynamicPolicyControlCmd extends AdminCmd<Void> {
    GetClientDynamicPolicyControlCmd() {
        super("getClientDynamicPolicyControl")
    }

    /**
     * Specifies the name of the application. This parameter applies to application and client attachments.  It is not applicable to trust service attachments. (String) 
     */
    def 'applicationName'(String value) {
        parameter("applicationName", value)
    }

    /**
     * Specifies the name of the application resource. (String)
     */
    def 'resource'(String value) {
        parameter("resource", value)
    }

}
