/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Displays the active JAXRS Provider for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.
*/
@Generated("with GenerateAdminCommands")
class ShowJaxrsProviderCmd extends AdminCmd<Void> {
    ShowJaxrsProviderCmd() {
        super("showJaxrsProvider")
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

}
