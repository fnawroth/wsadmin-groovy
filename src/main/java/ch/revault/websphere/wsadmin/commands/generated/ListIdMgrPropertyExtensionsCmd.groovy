/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the properties that have been extended for one or more entity types.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrPropertyExtensionsCmd extends AdminCmd<Void> {
    ListIdMgrPropertyExtensionsCmd() {
        super("listIdMgrPropertyExtensions")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Indicates the ID of the application that extends the property.
     */
    def 'applicationId'(String value) {
        parameter("applicationId", value)
    }

}
