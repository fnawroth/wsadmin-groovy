/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes a member from an application server cluster.
*/
@Generated("with GenerateAdminCommands")
class DeleteClusterMemberCmd extends AdminCmd<Void> {
    DeleteClusterMemberCmd() {
        super("deleteClusterMember")
    }

    /**
     * Name of server cluster which the cluster member to be deleted belongs to.
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

    /**
     * Name of node where the cluster member resides.
     */
    def 'memberNode'(String value) {
        parameter("memberNode", value)
    }

    /**
     * Name of cluster member to be deleted.
     */
    def 'memberName'(String value) {
        parameter("memberName", value)
    }

}
