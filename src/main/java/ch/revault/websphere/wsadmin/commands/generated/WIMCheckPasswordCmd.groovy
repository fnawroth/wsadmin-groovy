/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Validates the user/pasword in the Federated repositories user registry
*/
@Generated("with GenerateAdminCommands")
class WIMCheckPasswordCmd extends AdminCmd<Void> {
    WIMCheckPasswordCmd() {
        super("WIMCheckPassword")
    }

    /**
     * Supply a user name.
     */
    def 'username'(String value) {
        parameter("username", value)
    }

    /**
     * Supply a user password.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
