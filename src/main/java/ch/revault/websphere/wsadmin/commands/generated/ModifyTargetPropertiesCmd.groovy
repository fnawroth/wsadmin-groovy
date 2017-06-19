/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify properties associated with a specific Target.
*/
@Generated("with GenerateAdminCommands")
class ModifyTargetPropertiesCmd extends AdminCmd<Void> {
    ModifyTargetPropertiesCmd() {
        super("modifyTargetProperties")
    }

    /**
     * Name of the Target.
     */
    def 'targetName'(java.lang.String value) {
        parameter("targetName", value)
    }

    /**
     * Retrieve properties associated with Targets.
     */
    def 'targetProps'(java.util.Properties value) {
        parameter("targetProps", value)
    }

    /**
     * Flag to either replace the existing properties or not. The default is false.
     */
    def 'replace'(Boolean value) {
        parameter("replace", value)
    }

}
