/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Changes the active JAXRS Provider for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.  The Provider parameter must always be specified.
*/
@Generated("with GenerateAdminCommands")
class ModifyJaxrsProviderCmd extends AdminCmd<Void> {
    ModifyJaxrsProviderCmd() {
        super("modifyJaxrsProvider")
    }

    /**
     * The Node that the target Server is a member of.
     */
    def 'node'(java.lang.String value) {
        parameter("node", value)
    }

    /**
     * The target Server for the JAXRS Provider change.
     */
    def 'server'(java.lang.String value) {
        parameter("server", value)
    }

    /**
     * The new JAXRS Provider to change the target to.
     */
    def 'provider'(java.lang.String value) {
        parameter("provider", value)
    }

}
