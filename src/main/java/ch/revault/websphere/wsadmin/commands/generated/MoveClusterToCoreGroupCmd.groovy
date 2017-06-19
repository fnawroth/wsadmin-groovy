/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Move all servers in a cluster from one core group to another.
*/
@Generated("with GenerateAdminCommands")
class MoveClusterToCoreGroupCmd extends AdminCmd<Void> {
    MoveClusterToCoreGroupCmd() {
        super("moveClusterToCoreGroup")
    }

    /**
     * The name of the core group the cluster is to be moved from
     */
    def 'source'(String value) {
        parameter("source", value)
    }

    /**
     * The name of the core group the cluster is to be moved to
     */
    def 'target'(String value) {
        parameter("target", value)
    }

    /**
     * The name of the cluster containing the servers to be moved
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

    /**
     * If checking is disabled, do not check to ensure that all cluster members are currently in the same core group. Checking should only be disabled on the advice of IBM support to recover an inconsistent configuration.
     */
    def 'checkConfig'(Boolean value) {
        parameter("checkConfig", value)
    }

}
