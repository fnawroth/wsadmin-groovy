/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command adds SPNEGO Web authentication filter in the security configuration.
*/
@Generated("with GenerateAdminCommands")
class AddSpnegoFilterCmd extends AdminCmd<Void> {
    AddSpnegoFilterCmd() {
        super("addSpnegoFilter")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Supply a long host name.
     */
    def 'hostName'(String value) {
        parameter("hostName", value)
    }

    /**
     * Supply a Kerberos realm.
     */
    def 'krb5Realm'(String value) {
        parameter("krb5Realm", value)
    }

    /**
     * Supply HTTP request filter rules.
     */
    def 'filterCriteria'(String value) {
        parameter("filterCriteria", value)
    }

    /**
     * Supply HTTP filter classname.
     */
    def 'filterClass'(String value) {
        parameter("filterClass", value)
    }

    /**
     * Indicate whether or not Kerberos realm name is to be removed from the Kerberos principal name.
     */
    def 'trimUserName'(Boolean value) {
        parameter("trimUserName", value)
    }

    /**
     * Indicate whether or not to extract and place the client GSS delegation credential in the subject.
     */
    def 'enabledGssCredDelegate'(Boolean value) {
        parameter("enabledGssCredDelegate", value)
    }

    /**
     * Supply URI of resource with response for use when SPNEGO is not supported. If not specified, the response is "SPNEGO authentication is not supported on this client."
     */
    def 'spnegoNotSupportedPage'(String value) {
        parameter("spnegoNotSupportedPage", value)
    }

    /**
     * Supply URI of resource with response for use when NTLM token is received. If not specified, the response is "Your browser configuration is correct, but you have not logged into a supported Microsoft(R) Windows(R) Domain. Please login to the application using the normal login page."
     */
    def 'ntlmTokenReceivedPage'(String value) {
        parameter("ntlmTokenReceivedPage", value)
    }

}
