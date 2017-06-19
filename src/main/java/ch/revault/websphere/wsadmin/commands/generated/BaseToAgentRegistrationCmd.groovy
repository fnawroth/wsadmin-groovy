/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Security registration for base and admin agent.
*/
@Generated("with GenerateAdminCommands")
class BaseToAgentRegistrationCmd extends AdminCmd<Void> {
    BaseToAgentRegistrationCmd() {
        super("baseToAgentRegistration")
    }

    /**
     * Profile path for the appserver node being registered.
     */
    def 'profilePath'(String value) {
        parameter("profilePath", value)
    }

    /**
     * True if root signers from the Node and Admin Agent are to be removed from the Key Stores.  Default set to False.
     */
    def 'removeSigners'(Boolean value) {
        parameter("removeSigners", value)
    }

}
