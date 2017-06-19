/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates the configuration of an application server cluster.
*/
@Generated("with GenerateAdminCommands")
class UpdateClusterCmd extends AdminCmd<Void> {
    UpdateClusterCmd() {
        super("updateCluster")
    }

    /**
     * Name of server cluster to update.
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

}
