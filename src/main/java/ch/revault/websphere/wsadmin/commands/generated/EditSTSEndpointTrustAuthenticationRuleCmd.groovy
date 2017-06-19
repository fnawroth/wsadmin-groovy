/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Edit issuer, tokenTypeURI, jaasConfigName or callbackHandler attributes of the specified trust authentication rule.
*/
@Generated("with GenerateAdminCommands")
class EditSTSEndpointTrustAuthenticationRuleCmd extends AdminCmd<Void> {
    EditSTSEndpointTrustAuthenticationRuleCmd() {
        super("editSTSEndpointTrustAuthenticationRule")
    }

    /**
     * The issuer (URI).
     */
    def 'issuer'(String value) {
        parameter("issuer", value)
    }

    /**
     * The new issuer (URI) to use for the rule.
     */
    def 'newIssuer'(String value) {
        parameter("newIssuer", value)
    }

    /**
     * URI of the token type.
     */
    def 'tokenTypeURI'(String value) {
        parameter("tokenTypeURI", value)
    }

    /**
     * The new token type URI for the rule.
     */
    def 'newTokenTypeURI'(String value) {
        parameter("newTokenTypeURI", value)
    }

    /**
     * The new JAAS config name to use for the rule.
     */
    def 'newJAASConfigName'(String value) {
        parameter("newJAASConfigName", value)
    }

    /**
     * The new callback handler to use for the rule.
     */
    def 'newCallbackHandler'(String value) {
        parameter("newCallbackHandler", value)
    }

}
