/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the datasources that are contained in the specified scope.
*/
@Generated("with GenerateAdminCommands")
class ListDatasourcesCmd extends AdminCmd<Void> {
    ListDatasourcesCmd() {
        super("listDatasources")
    }

    /**
     * Scope for the datasources that are to be listed in the forms type or type=name, where type is one of Cell | Node | Server | Application | Cluster, and name is the Cell, Node, Server, Application, or Cluster instance; default: All.
     */
    def 'scope'(String value) {
        parameter("scope", value)
    }

}
