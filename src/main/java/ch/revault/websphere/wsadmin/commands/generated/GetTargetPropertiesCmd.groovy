/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get properties associated with a specific Target.
*/
@Generated("with GenerateAdminCommands")
class GetTargetPropertiesCmd extends AdminCmd<Void> {
    GetTargetPropertiesCmd() {
        super("getTargetProperties")
    }

    /**
     * List of target names.
     */
    def 'targetNameList'(java.lang.String[] value) {
        parameter("targetNameList", value)
    }

}
