/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command will migrate a server messaging engine to a cluster messaging engine. It will not modify the messaging engine message store. Please ensure that the message store is suitable for the new clustered environment. If it is not, the migrated engine must be re-configured with a suitable message store before it is started, or the engine may fail to start.
*/
@Generated("with GenerateAdminCommands")
class MigrateServerMEtoClusterCmd extends AdminCmd<Void> {
    MigrateServerMEtoClusterCmd() {
        super("migrateServerMEtoCluster")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Node name
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * Server name
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * Cluster name
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * Rename engine (defaults to false)
     */
    def 'rename'(Boolean value) {
        parameter("rename", value)
    }

}
