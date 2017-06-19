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
class BaseToAgentRegistrationAfterStartCmd extends AdminCmd<Void> {
    BaseToAgentRegistrationAfterStartCmd() {
        super("baseToAgentRegistrationAfterStart")
    }

    /**
     * Profile path for the appserver node being registered.
     */
    def 'profilePath'(String value) {
        parameter("profilePath", value)
    }

}
