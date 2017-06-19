/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the security domain that a particular scope belongs to.
*/
@Generated("with GenerateAdminCommands")
class GetSecurityDomainForResourceCmd extends AdminCmd<Void> {
    GetSecurityDomainForResourceCmd() {
        super("getSecurityDomainForResource")
    }

    /**
     * Name of the scope used to find the domain it is mapped to.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

    /**
     * Specify true to return the effective security domain for the resource provided and false to only return the direct security domain for the resource.
     */
    def 'getEffectiveDomain'(Boolean value) {
        parameter("getEffectiveDomain", value)
    }

}
