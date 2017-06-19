/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a new member of an application server cluster.
*/
@Generated("with GenerateAdminCommands")
class CreateClusterMemberCmd extends AdminCmd<Void> {
    CreateClusterMemberCmd() {
        super("createClusterMember")
    }

    /**
     * Name of server cluster which the new cluster member will belong to.
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

}
