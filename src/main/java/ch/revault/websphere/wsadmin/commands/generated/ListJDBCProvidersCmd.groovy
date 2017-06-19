/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the JDBC providers that are contained in the specified scope.
*/
@Generated("with GenerateAdminCommands")
class ListJDBCProvidersCmd extends AdminCmd<Void> {
    ListJDBCProvidersCmd() {
        super("listJDBCProviders")
    }

    /**
     * Scope for JDBC providers that are to be listed in the forms type or type=name, where type is one of Cell | Node | Server | Application | Cluster, and name is the Cell, Node, Server, Application, or Cluster instance; default: All.
     */
    def 'scope'(String value) {
        parameter("scope", value)
    }

}
