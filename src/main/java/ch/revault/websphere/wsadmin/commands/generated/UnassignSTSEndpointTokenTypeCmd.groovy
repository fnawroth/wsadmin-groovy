/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Disassociate an endpoint from its token type.
*/
@Generated("with GenerateAdminCommands")
class UnassignSTSEndpointTokenTypeCmd extends AdminCmd<Void> {
    UnassignSTSEndpointTokenTypeCmd() {
        super("unassignSTSEndpointTokenType")
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
