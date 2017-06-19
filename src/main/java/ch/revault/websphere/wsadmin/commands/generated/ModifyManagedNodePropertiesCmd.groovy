/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify properties associated with a specific managed node. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class ModifyManagedNodePropertiesCmd extends AdminCmd<Void> {
    ModifyManagedNodePropertiesCmd() {
        super("modifyManagedNodeProperties")
    }

    /**
     * Name of the managed node.
     */
    def 'managedNodeName'(java.lang.String value) {
        parameter("managedNodeName", value)
    }

    /**
     * Retrieve properties associated with managed resources.
     */
    def 'managedNodeProps'(java.util.Properties value) {
        parameter("managedNodeProps", value)
    }

    /**
     * Flag to either replace the existing properties or not. The default is false.
     */
    def 'replace'(Boolean value) {
        parameter("replace", value)
    }

}
