/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete the Custom property
*/
@Generated("with GenerateAdminCommands")
class DeleteSCClientCacheConfigurationCustomPropertiesCmd extends AdminCmd<Void> {
    DeleteSCClientCacheConfigurationCustomPropertiesCmd() {
        super("deleteSCClientCacheConfigurationCustomProperties")
    }

    /**
     * Names of the properties.
     */
    def 'propertyNames'(java.lang.String[] value) {
        parameter("propertyNames", value)
    }

}
