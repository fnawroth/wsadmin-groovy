/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The setProviderPolicySharingInfo command sets the WSPolicy provider sharing information for a specified resource within an application.
*/
@Generated("with GenerateAdminCommands")
class SetProviderPolicySharingInfoCmd extends AdminCmd<Void> {
    SetProviderPolicySharingInfoCmd() {
        super("setProviderPolicySharingInfo")
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

    /**
     * Specifies the WSPolicy provider sharing methods. (String)
     */
    def 'sharePolicyMethods'(java.lang.String[] value) {
        parameter("sharePolicyMethods", value)
    }

    /**
     * Specifies the WSMex resource properties. (Properties)
     */
    def 'wsMexProperties'(java.util.Properties value) {
        parameter("wsMexProperties", value)
    }

    /**
     * Specifies whether to remove a server-specific default binding or to remove a custom binding from an attachment. You cannot remove a cell-level default binding. The default value is false. (Boolean) 
     */
    def 'remove'(Boolean value) {
        parameter("remove", value)
    }

}
