/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a SSL Configuration Group.
*/
@Generated("with GenerateAdminCommands")
class CreateSSLConfigGroupCmd extends AdminCmd<Void> {
    CreateSSLConfigGroupCmd() {
        super("createSSLConfigGroup")
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
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
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
    def 'sslConfigScopeName'(String value) {
        parameter("sslConfigScopeName", value)
    }

}
