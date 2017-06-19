/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a core group policy for a messaging engine configured for server cluster bus member with messaging engine policy assistance enabled for the "Custom" policy.
*/
@Generated("with GenerateAdminCommands")
class CreateMissingSIBEnginePolicyCmd extends AdminCmd<Void> {
    CreateMissingSIBEnginePolicyCmd() {
        super("createMissingSIBEnginePolicy")
    }

    /**
     * The name of the messaging engine to create a core group policy for.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Indicates that the messaging engine created can failover to other servers. This option can be used when messaging engine policy assistance is enabled and the "CUSTOM" policy is selected. 
     */
    def 'failover'(Boolean value) {
        parameter("failover", value)
    }

    /**
     * Indicates that the messaging engine created can fail back to a preferred server. This option can be used when messaging engine policy assistance is enabled and the "CUSTOM" policy is selected. 
     */
    def 'failback'(Boolean value) {
        parameter("failback", value)
    }

    /**
     * Indicates that the messaging engine created can failover to other servers. This option can be used when messaging engine policy assistance is enabled and the "CUSTOM" policy is selected.
     */
    def 'preferredServersOnly'(Boolean value) {
        parameter("preferredServersOnly", value)
    }

}
