/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Gets information about a certificate authority (CA) client configurator object.
*/
@Generated("with GenerateAdminCommands")
class GetCAClientCmd extends AdminCmd<Void> {
    GetCAClientCmd() {
        super("getCAClient")
    }

    /**
     * Specifies the name that uniquely identifies the certificate authority (CA) configurator.
     */
    def 'caClientName'(String value) {
        parameter("caClientName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
