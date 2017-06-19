/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove Web Services Security distributed cache custom properties
*/
@Generated("with GenerateAdminCommands")
class DeleteWSSDistributedCacheConfigCustomPropertiesCmd extends AdminCmd<Void> {
    DeleteWSSDistributedCacheConfigCustomPropertiesCmd() {
        super("deleteWSSDistributedCacheConfigCustomProperties")
    }

    /**
     * WSS Distributed Cache Config Custom Properties
     */
    def 'propertyNames'(java.lang.String[] value) {
        parameter("propertyNames", value)
    }

}
