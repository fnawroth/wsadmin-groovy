/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates all cluster members about the application config changes.
*/
@Generated("with GenerateAdminCommands")
class UpdateAppOnClusterCmd extends AdminCmd<Void> {
    UpdateAppOnClusterCmd() {
        super("updateAppOnCluster")
    }

    /**
     * Names of applications that are modified.
     */
    def 'ApplicationNames'(java.lang.String[] value) {
        parameter("ApplicationNames", value)
    }

    /**
     * Timeout value for each node update.
     */
    def 'timeout'(Integer value) {
        parameter("timeout", value)
    }

}
