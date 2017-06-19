/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Checks to make sure that at least one admin user in the admin-authz.xml file exists in the input user registry.
*/
@Generated("with GenerateAdminCommands")
class IsAdminLockedOutCmd extends AdminCmd<Void> {
    IsAdminLockedOutCmd() {
        super("isAdminLockedOut")
    }

    /**
     * Supply a valid user registry type.  Valid types are: LDAPUserRegistry, CustomUserRegistry, WIMUserRegistry, and LocalOSUserRegistry.
     */
    def 'registryType'(String value) {
        parameter("registryType", value)
    }

}
