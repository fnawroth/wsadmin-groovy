/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Applies current Security Wizard settings from the workspace.
*/
@Generated("with GenerateAdminCommands")
class ApplyWizardSettingsCmd extends AdminCmd<Void> {
    ApplyWizardSettingsCmd() {
        super("applyWizardSettings")
    }

    /**
     * Set application-level security: true/false.
     */
    def 'secureApps'(Boolean value) {
        parameter("secureApps", value)
    }

    /**
     * Set Java 2 Security: true/false.
     */
    def 'secureLocalResources'(Boolean value) {
        parameter("secureLocalResources", value)
    }

    /**
     * Supply a valid user registry type.  Valid types are: LDAPUserRegistry, CustomUserRegistry, WIMUserRegistry, and LocalOSUserRegistry.
     */
    def 'userRegistryType'(String value) {
        parameter("userRegistryType", value)
    }

    /**
     * Supply the class name of the custom user registry.
     */
    def 'customRegistryClass'(String value) {
        parameter("customRegistryClass", value)
    }

    /**
     * Supply any custom user registry properties.
     */
    def 'customProps'(String value) {
        parameter("customProps", value)
    }

    /**
     * Supply a valid LDAP Server type.  Valid values are: IBM_DIRECTORY_SERVER, IPLANET, NETSCAPE, NDS, DOMINO502, SECUREWAY, ACTIVE_DIRECTORY, CUSTOM
     */
    def 'ldapServerType'(String value) {
        parameter("ldapServerType", value)
    }

    /**
     * Supply a valid LDAP host name for the LDAP server.
     */
    def 'ldapHostName'(String value) {
        parameter("ldapHostName", value)
    }

    /**
     * Supply a valid port number for the LDAP server.
     */
    def 'ldapPort'(String value) {
        parameter("ldapPort", value)
    }

    /**
     * Supply a valid LDAP base distinguished name.
     */
    def 'ldapBaseDN'(String value) {
        parameter("ldapBaseDN", value)
    }

    /**
     * Supply a valid LDAP bind distinguished name.
     */
    def 'ldapBindDN'(String value) {
        parameter("ldapBindDN", value)
    }

    /**
     * Supply a valid LDAP bind password.
     */
    def 'ldapBindPassword'(String value) {
        parameter("ldapBindPassword", value)
    }

    /**
     * Supply an administrative user name.
     */
    def 'adminName'(String value) {
        parameter("adminName", value)
    }

    /**
     * Supply an administrative user password.
     */
    def 'adminPassword'(String value) {
        parameter("adminPassword", value)
    }

    /**
     * Specifies that a case-insensitive authorization check be performed: true/false.
     */
    def 'ignoreCase'(Boolean value) {
        parameter("ignoreCase", value)
    }

}
