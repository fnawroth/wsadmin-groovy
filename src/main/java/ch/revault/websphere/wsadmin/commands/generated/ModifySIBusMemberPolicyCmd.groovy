/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a cluster bus members messaging engine policy assistance settings.
*/
@Generated("with GenerateAdminCommands")
class ModifySIBusMemberPolicyCmd extends AdminCmd<Void> {
    ModifySIBusMemberPolicyCmd() {
        super("modifySIBusMemberPolicy")
    }

    /**
     * Name of bus to which the member belongs.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the cluster that belongs to the bus.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * Select this option to enable messaging engine policy assistance. A policy name must also be supplied.
     */
    def 'enableAssistance'(Boolean value) {
        parameter("enableAssistance", value)
    }

    /**
     * The name of the policy that the messaging engine policy assistance should apply. Messaging engine policy assistance must be enabled.
     */
    def 'policyName'(String value) {
        parameter("policyName", value)
    }

}
