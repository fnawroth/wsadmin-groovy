/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds the adminId to the user registry object in the security.xml file
*/
@Generated("with GenerateAdminCommands")
class AddAdminIdToUserRegObjCmd extends AdminCmd<Void> {
    AddAdminIdToUserRegObjCmd() {
        super("addAdminIdToUserRegObj")
    }

    /**
     * Supply an administrative user name. 
     */
    def 'adminUser'(String value) {
        parameter("adminUser", value)
    }

    /**
     * Supply a valid user registry type.  Valid types are: LDAPUserRegistry, CustomUserRegistry, WIMUserRegistry, and LocalOSUserRegistry.
     */
    def 'registryType'(String value) {
        parameter("registryType", value)
    }

}
