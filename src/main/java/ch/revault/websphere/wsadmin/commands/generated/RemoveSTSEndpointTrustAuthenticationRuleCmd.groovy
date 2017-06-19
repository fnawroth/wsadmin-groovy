/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove an identity rule, trust authentication rules applied to a specified token type or rules applied to a specified issuer.
*/
@Generated("with GenerateAdminCommands")
class RemoveSTSEndpointTrustAuthenticationRuleCmd extends AdminCmd<Void> {
    RemoveSTSEndpointTrustAuthenticationRuleCmd() {
        super("removeSTSEndpointTrustAuthenticationRule")
    }

    /**
     * Specify a null issuer.
     */
    def 'nullIssuer'(Boolean value) {
        parameter("nullIssuer", value)
    }

    /**
     * The issuer (URI).
     */
    def 'issuer'(String value) {
        parameter("issuer", value)
    }

    /**
     * URI of the token type.
     */
    def 'tokenTypeURI'(String value) {
        parameter("tokenTypeURI", value)
    }

    /**
     * Identifying properties.
     */
    def 'identity'(java.util.Properties value) {
        parameter("identity", value)
    }

}
