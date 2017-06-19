/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update the assigned token type for an endpoint. If the local name parameter is omitted, the default token type is assumed.
*/
@Generated("with GenerateAdminCommands")
class UpdateSTSEndpointTokenTypeCmd extends AdminCmd<Void> {
    UpdateSTSEndpointTokenTypeCmd() {
        super("updateSTSEndpointTokenType")
    }

    /**
     * The local name of the token type.
     */
    def 'LocalName'(String value) {
        parameter("LocalName", value)
    }

    /**
     * Local name specifying new token type to apply.
     */
    def 'newLocalName'(String value) {
        parameter("newLocalName", value)
    }

    /**
     * Specify the default local name.
     */
    def 'defaultLocalName'(Boolean value) {
        parameter("defaultLocalName", value)
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
     * Specify a null issuer.
     */
    def 'nullIssuer'(Boolean value) {
        parameter("nullIssuer", value)
    }

}
