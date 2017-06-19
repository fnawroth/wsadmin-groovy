/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the trace specification for the server. If the server is running new trace specification takes effect immediately. This command also saves the trace specification in configuration.
*/
@Generated("with GenerateAdminCommands")
class SetTraceSpecificationCmd extends AdminCmd<Void> {
    SetTraceSpecificationCmd() {
        super("setTraceSpecification")
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
     * Trace Specification
     */
    def 'traceSpecification'(String value) {
        parameter("traceSpecification", value)
    }

    /**
     * Save the trace specification to the configuration.
     */
    def 'persist'(Boolean value) {
        parameter("persist", value)
    }

}
