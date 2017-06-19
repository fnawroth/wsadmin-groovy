/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add an identity rule to the specified trust authentication rule.
*/
@Generated("with GenerateAdminCommands")
class AddSTSEndpointTrustAuthenticationRuleCmd extends AdminCmd<Void> {
    AddSTSEndpointTrustAuthenticationRuleCmd() {
        super("addSTSEndpointTrustAuthenticationRule")
    }

    /**
     * URI of the token type.
     */
    def 'tokenTypeURI'(String value) {
        parameter("tokenTypeURI", value)
    }

    /**
     * The issuer (URI).
     */
    def 'issuer'(String value) {
        parameter("issuer", value)
    }

    /**
     * JAAS configuration name describing the login modules to apply for authentication.
     */
    def 'jaasConfigName'(String value) {
        parameter("jaasConfigName", value)
    }

    /**
     * Specify a special callback handler to use in the login modules.
     */
    def 'callbackHandler'(String value) {
        parameter("callbackHandler", value)
    }

    /**
     * Identifying properties.
     */
    def 'identity'(java.util.Properties value) {
        parameter("identity", value)
    }

}
