/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Change the password of an account in the file registry.
*/
@Generated("with GenerateAdminCommands")
class ChangeFileRegistryAccountPasswordCmd extends AdminCmd<Void> {
    ChangeFileRegistryAccountPasswordCmd() {
        super("changeFileRegistryAccountPassword")
    }

    /**
     * User's ID
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * User's password
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * User's fully qualified unique name
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

}
