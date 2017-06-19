/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The administrative security field in the security.xml file is updated based on the user input of true or false.
*/
@Generated("with GenerateAdminCommands")
class SetGlobalSecurityCmd extends AdminCmd<Void> {
    SetGlobalSecurityCmd() {
        super("setGlobalSecurity")
    }

    /**
     * Supply value for Global Security Setting: true/false.
     */
    def 'enabled'(Boolean value) {
        parameter("enabled", value)
    }

}
