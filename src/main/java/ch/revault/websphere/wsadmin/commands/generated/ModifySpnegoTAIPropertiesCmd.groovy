/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command modifies SPNEGO TAI properties in the security configuration.
*/
@Generated("with GenerateAdminCommands")
class ModifySpnegoTAIPropertiesCmd extends AdminCmd<Void> {
    ModifySpnegoTAIPropertiesCmd() {
        super("modifySpnegoTAIProperties")
    }

    /**
     * Supply SPN identifier number.
     */
    def 'spnId'(Integer value) {
        parameter("spnId", value)
    }

    /**
     * Supply a long host name.
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * Supply HTTP request filter rules.
     */
    def 'filter'(String value) {
        parameter("filter", value)
    }

    /**
     * Supply HTTP filter classname.
     */
    def 'filterClass'(String value) {
        parameter("filterClass", value)
    }

    /**
     * Supply URI of resource with response for use when SPNEGO is not supported. If not specified, the response is "SPNEGO authentication is not supported on this client."
     */
    def 'noSpnegoPage'(String value) {
        parameter("noSpnegoPage", value)
    }

    /**
     * Supply URI of resource with response for use when NTLM token is received. If not specified, the response is "Your browser configuration is correct, but you have not logged into a supported Microsoft(R) Windows(R) Domain. Please login to the application using the normal login page."
     */
    def 'ntlmTokenPage'(String value) {
        parameter("ntlmTokenPage", value)
    }

    /**
     * Indicate whether or not Kerberos realm name is to be removed from the Kerberos principal name.
     */
    def 'trimUserName'(Boolean value) {
        parameter("trimUserName", value)
    }

}
