/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command sets the active authentication mechanism attribute in the security configuration. 
*/
@Generated("with GenerateAdminCommands")
class SetActiveAuthMechanismCmd extends AdminCmd<Void> {
    SetActiveAuthMechanismCmd() {
        super("setActiveAuthMechanism")
    }

    /**
     * Supply value for active authentication mechanism type: KRB5/LTPA.
     */
    def 'authMechanismType'(String value) {
        parameter("authMechanismType", value)
    }

}
