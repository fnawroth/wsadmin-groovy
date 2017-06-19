/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update Web Services Security distributed cache configuration custom properties
*/
@Generated("with GenerateAdminCommands")
class UpdateWSSDistributedCacheCustomConfigCmd extends AdminCmd<Void> {
    UpdateWSSDistributedCacheCustomConfigCmd() {
        super("updateWSSDistributedCacheCustomConfig")
    }

    /**
     * WSS Distributed Cache Config Custom Properties
     */
    def 'customProperties'(java.util.Properties value) {
        parameter("customProperties", value)
    }

}
