/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List SAML Issuer Configuration data
*/
@Generated("with GenerateAdminCommands")
class ListSAMLIssuerConfigCmd extends AdminCmd<Void> {
    ListSAMLIssuerConfigCmd() {
        super("listSAMLIssuerConfig")
    }

    /**
     * Node name where the SAML Issuer Config file resides
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Server name where the SAML Issuer Config file resides 
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

}
