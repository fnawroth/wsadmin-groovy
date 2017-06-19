/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Map a resource to a security domain.
*/
@Generated("with GenerateAdminCommands")
class MapResourceToSecurityDomainCmd extends AdminCmd<Void> {
    MapResourceToSecurityDomainCmd() {
        super("mapResourceToSecurityDomain")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specifies the resource that is to be mapped to the security domain.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

}
