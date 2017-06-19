/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the identity rules under the specified trust authentication rule.
*/
@Generated("with GenerateAdminCommands")
class ListSTSEndpointTrustAuthenticationRulesCmd extends AdminCmd<Void> {
    ListSTSEndpointTrustAuthenticationRulesCmd() {
        super("listSTSEndpointTrustAuthenticationRules")
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

}
