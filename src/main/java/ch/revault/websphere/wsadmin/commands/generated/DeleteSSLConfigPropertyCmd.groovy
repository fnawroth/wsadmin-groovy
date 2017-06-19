/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a SSLConfig Property.
*/
@Generated("with GenerateAdminCommands")
class DeleteSSLConfigPropertyCmd extends AdminCmd<Void> {
    DeleteSSLConfigPropertyCmd() {
        super("deleteSSLConfigProperty")
    }

    /**
     * Specifies alias that uniquely identifies a SSL configuration.
     */
    def 'sslConfigAliasName'(String value) {
        parameter("sslConfigAliasName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Name of SSLConfig property.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

}
