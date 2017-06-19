/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* WASX7047I: Method: invoke

	Arguments: object name, operation

	Description: Invoke the operation named by "operation" on the MBean
	described by "object name."  No arguments are passed for the operation.

	Method: invoke

	Arguments: object name, operation, arguments

	Description: Invoke the operation named by "operation" on the MBean
	described by "object name" using the parameters described by 
	"arguments."  If no arguments are required for this operation, the
	"arguments" parameter may be omitted.

	Method: invoke

	Arguments: object name, operation, arguments, signature

	Description: Invoke the operation named by "operation" on the MBean
	described by "object name" using the parameters described by "arguments"
	and the signatures described by "signature."
*/
@Generated("with GenerateAdminCommands")
class Adminservice_invokeCmd extends AdminCmd<Void> {
    Adminservice_invokeCmd() {
        super("adminservice_invoke")
    }

    /**
     * null
     */
    def 'operation'(java.lang.String value) {
        parameter("operation", value)
    }

    /**
     * null
     */
    def 'params'(java.lang.Object[] value) {
        parameter("params", value)
    }

    /**
     * null
     */
    def 'signature'(java.lang.String[] value) {
        parameter("signature", value)
    }

}
