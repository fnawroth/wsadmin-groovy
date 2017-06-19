/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete the configuration of an application server cluster.
*/
@Generated("with GenerateAdminCommands")
class DeleteClusterCmd extends AdminCmd<Void> {
    DeleteClusterCmd() {
        super("deleteCluster")
    }

    /**
     * Name of server cluster to delete.
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

}
