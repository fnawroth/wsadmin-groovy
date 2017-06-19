/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set Java virtual machine (JVM) Maximum Heap Size
*/
@Generated("with GenerateAdminCommands")
class SetJVMMaxHeapSizeCmd extends AdminCmd<Void> {
    SetJVMMaxHeapSizeCmd() {
        super("setJVMMaxHeapSize")
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
     * The process type of the server.  This is for zOS only.
     */
    def 'processType'(String value) {
        parameter("processType", value)
    }

    /**
     * Specifies the maximum heap size available to the JVM code, in megabytes.
     */
    def 'maximumHeapSize'(Integer value) {
        parameter("maximumHeapSize", value)
    }

}
