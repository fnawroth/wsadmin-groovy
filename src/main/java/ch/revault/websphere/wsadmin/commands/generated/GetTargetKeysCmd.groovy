/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get properties keys associated with a specific Target.
*/
@Generated("with GenerateAdminCommands")
class GetTargetKeysCmd extends AdminCmd<Void> {
    GetTargetKeysCmd() {
        super("getTargetKeys")
    }

    /**
     * Name of the Target.
     */
    def 'targetName'(java.lang.String value) {
        parameter("targetName", value)
    }

}
