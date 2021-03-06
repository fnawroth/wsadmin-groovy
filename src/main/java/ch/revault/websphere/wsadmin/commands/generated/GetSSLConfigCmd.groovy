/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get information about a particular SSL configuration.
*/
@Generated("with GenerateAdminCommands")
class GetSSLConfigCmd extends AdminCmd<Void> {
    GetSSLConfigCmd() {
        super("getSSLConfig")
    }

    /**
     * Specifies alias that uniquely identifies a SSL configuration.
     */
    def 'alias'(String value) {
        parameter("alias", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
