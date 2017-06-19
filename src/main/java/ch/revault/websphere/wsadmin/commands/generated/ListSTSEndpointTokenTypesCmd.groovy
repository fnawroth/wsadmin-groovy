/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List assigned token types for an endpoint.
*/
@Generated("with GenerateAdminCommands")
class ListSTSEndpointTokenTypesCmd extends AdminCmd<Void> {
    ListSTSEndpointTokenTypesCmd() {
        super("listSTSEndpointTokenTypes")
    }

    /**
     * The issuer (URI).
     */
    def 'issuer'(String value) {
        parameter("issuer", value)
    }

}
