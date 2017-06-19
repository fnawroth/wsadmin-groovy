/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update the SC custom config
*/
@Generated("with GenerateAdminCommands")
class UpdateSCClientCacheCustomConfigurationCmd extends AdminCmd<Void> {
    UpdateSCClientCacheCustomConfigurationCmd() {
        super("updateSCClientCacheCustomConfiguration")
    }

    /**
     * Token type custom properties.
     */
    def 'customProperties'(java.util.Properties value) {
        parameter("customProperties", value)
    }

}
