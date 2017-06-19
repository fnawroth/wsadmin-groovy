/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Ensures that a messaging engines core group policy conforms to its associated bus members messaging engine assistance policy.
*/
@Generated("with GenerateAdminCommands")
class CorrectSIBEnginePolicyCmd extends AdminCmd<Void> {
    CorrectSIBEnginePolicyCmd() {
        super("correctSIBEnginePolicy")
    }

    /**
     * The name of the messaging engine to correct the core group policy for.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
