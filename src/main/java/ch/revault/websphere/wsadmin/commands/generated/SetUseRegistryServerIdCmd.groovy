/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The useRegistryServerId security field in userRegistry object in the security.xml file is updated based on the user input of true or false.
*/
@Generated("with GenerateAdminCommands")
class SetUseRegistryServerIdCmd extends AdminCmd<Void> {
    SetUseRegistryServerIdCmd() {
        super("setUseRegistryServerId")
    }

    /**
     * Supply value for useRegistryServerId Setting: true/false.
     */
    def 'useRegistryServerId'(Boolean value) {
        parameter("useRegistryServerId", value)
    }

    /**
     * Supply a valid user registry type.  Valid types are: LDAPUserRegistry, CustomUserRegistry, WIMUserRegistry, and LocalOSUserRegistry.
     */
    def 'userRegistryType'(String value) {
        parameter("userRegistryType", value)
    }

}
