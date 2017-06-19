/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The setClientDynamicPolicyControl command sets the WSPolicy client acquisition information for a specified resource within an application.
*/
@Generated("with GenerateAdminCommands")
class SetClientDynamicPolicyControlCmd extends AdminCmd<Void> {
    SetClientDynamicPolicyControlCmd() {
        super("setClientDynamicPolicyControl")
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
     * Specifies the WSPolicy provider acquisition method for a client. (String)
     */
    def 'acquireProviderPolicyMethod'(String value) {
        parameter("acquireProviderPolicyMethod", value)
    }

    /**
     * Specifies the HTTP GET resource properties. (Properties)
     */
    def 'httpGetProperties'(java.util.Properties value) {
        parameter("httpGetProperties", value)
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
