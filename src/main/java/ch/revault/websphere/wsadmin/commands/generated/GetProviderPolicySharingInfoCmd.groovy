/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getProviderPolicySharingInfo command returns the WSPolicy provider sharing information for a specified application or resource.
*/
@Generated("with GenerateAdminCommands")
class GetProviderPolicySharingInfoCmd extends AdminCmd<Void> {
    GetProviderPolicySharingInfoCmd() {
        super("getProviderPolicySharingInfo")
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
