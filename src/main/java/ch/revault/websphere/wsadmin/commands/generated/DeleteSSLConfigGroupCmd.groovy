/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a SSLConfig group.
*/
@Generated("with GenerateAdminCommands")
class DeleteSSLConfigGroupCmd extends AdminCmd<Void> {
    DeleteSSLConfigGroupCmd() {
        super("deleteSSLConfigGroup")
    }

    /**
     * Specifies a unique name to identify an SSL Configuration group.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Direction for this SSL configuration group, inbound or outbound.
     */
    def 'direction'(String value) {
        parameter("direction", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
