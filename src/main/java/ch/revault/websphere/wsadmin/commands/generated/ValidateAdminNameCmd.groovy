/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Validates the existence of the administrator name in the input user registry.
*/
@Generated("with GenerateAdminCommands")
class ValidateAdminNameCmd extends AdminCmd<Void> {
    ValidateAdminNameCmd() {
        super("validateAdminName")
    }

    /**
     * Supply a valid user registry type.  Valid types are: LDAPUserRegistry, CustomUserRegistry, WIMUserRegistry, and LocalOSUserRegistry.
     */
    def 'registryType'(String value) {
        parameter("registryType", value)
    }

    /**
     * Supply a valid LDAP Server type.  Valid values are: IBM_DIRECTORY_SERVER, IPLANET, NETSCAPE, NDS, DOMINO502, SECUREWAY, ACTIVE_DIRECTORY, CUSTOM
     */
    def 'ldapServerType'(String value) {
        parameter("ldapServerType", value)
    }

    /**
     * Supply an administrative user name. 
     */
    def 'adminUser'(String value) {
        parameter("adminUser", value)
    }

}
