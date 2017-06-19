/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates the weights of the specified cluster members.
*/
@Generated("with GenerateAdminCommands")
class UpdateClusterMemberWeightsCmd extends AdminCmd<Void> {
    UpdateClusterMemberWeightsCmd() {
        super("updateClusterMemberWeights")
    }

    /**
     * Name of server cluster to update.
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

}
