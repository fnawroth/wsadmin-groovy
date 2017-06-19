/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Assign a token type to be issued for the client to access a given endpoint. Endpoints must be unique. If the local name parameter is omitted, the default token type is assumed.
*/
@Generated("with GenerateAdminCommands")
class AssignSTSEndpointTokenTypeCmd extends AdminCmd<Void> {
    AssignSTSEndpointTokenTypeCmd() {
        super("assignSTSEndpointTokenType")
    }

    /**
     * The local name of the token type.
     */
    def 'LocalName'(String value) {
        parameter("LocalName", value)
    }

    /**
     * The issuer (URI).
     */
    def 'issuer'(String value) {
        parameter("issuer", value)
    }

}
