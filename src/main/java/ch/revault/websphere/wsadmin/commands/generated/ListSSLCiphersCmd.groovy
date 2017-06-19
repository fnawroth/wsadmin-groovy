/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List of ciphers.
*/
@Generated("with GenerateAdminCommands")
class ListSSLCiphersCmd extends AdminCmd<Void> {
    ListSSLCiphersCmd() {
        super("listSSLCiphers")
    }

    /**
     * Specifies alias that uniquely identifies a SSL configuration.
     */
    def 'sslConfigAliasName'(String value) {
        parameter("sslConfigAliasName", value)
    }

    /**
     * Specifies the scope name of the SSL configuration.   
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specifies the security level of the SSL configuration, HIGH, MEDIUM, LOW, or CUSTOM.
     */
    def 'securityLevel'(String value) {
        parameter("securityLevel", value)
    }

}
