/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates the installation/deployment of the Asynchronous Response Servlet which is used when JAX-WS client applications use the JAX-WS asynchronous API
*/
@Generated("with GenerateAdminCommands")
class UpdateARSConfigCmd extends AdminCmd<Void> {
    UpdateARSConfigCmd() {
        super("updateARSConfig")
    }

    /**
     * Current Node
     */
    def 'nodeName'(java.lang.String value) {
        parameter("nodeName", value)
    }

}
