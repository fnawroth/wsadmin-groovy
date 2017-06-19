/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set Server Instance configuration. This command only applies to the z/OS platform.
*/
@Generated("with GenerateAdminCommands")
class SetServerInstanceCmd extends AdminCmd<Void> {
    SetServerInstanceCmd() {
        super("setServerInstance")
    }

    /**
     * The name of the Server whose process definition is modified. If there is only one server in the entire configuration, then this parameter is optional.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The name of the node. This is only needed for the server scopes that do not have a unique name across nodes.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Enable Multiple  Server Instances.  This parameter only applies to the z/OS platform.
     */
    def 'enableMultipleServerInstances'(Boolean value) {
        parameter("enableMultipleServerInstances", value)
    }

    /**
     * Minimum Number Of Instances.  This parameter only applies to the z/OS platform.
     */
    def 'minimumNumOfInstances'(Integer value) {
        parameter("minimumNumOfInstances", value)
    }

    /**
     * Maximum Number Of Instances.   This parameter only applies to the z/OS platform.
     */
    def 'maximumNumberOfInstances'(Integer value) {
        parameter("maximumNumberOfInstances", value)
    }

}
