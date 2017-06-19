/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a string containing the alias of the SSL Configuration and the certificate alias for the specified scope.
*/
@Generated("with GenerateAdminCommands")
class GetInheritedSSLConfigCmd extends AdminCmd<Void> {
    GetInheritedSSLConfigCmd() {
        super("getInheritedSSLConfig")
    }

    /**
     * Specifies the management scope to get inherited SSL configuration information about.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Direction for this SSL configuration group, inbound or outbound.
     */
    def 'direction'(String value) {
        parameter("direction", value)
    }

}
