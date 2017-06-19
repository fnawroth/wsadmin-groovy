/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Unsets active security settings on a security domain.  The attribute is removed from the security domain configuration.
*/
@Generated("with GenerateAdminCommands")
class UnsetAppActiveSecuritySettingsCmd extends AdminCmd<Void> {
    UnsetAppActiveSecuritySettingsCmd() {
        super("unsetAppActiveSecuritySettings")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Unset the application security enabled value on the security domain.
     */
    def 'unsetAppSecurityEnabled'(Boolean value) {
        parameter("unsetAppSecurityEnabled", value)
    }

    /**
     * Unset the active user registry value on the security domain.
     */
    def 'unsetActiveUserRegistry'(Boolean value) {
        parameter("unsetActiveUserRegistry", value)
    }

    /**
     * Unset the use domain qualified user name value on the security domain.
     */
    def 'unsetUseDomainQualifiedUserNames'(Boolean value) {
        parameter("unsetUseDomainQualifiedUserNames", value)
    }

    /**
     * Unset the enforce java 2 security value on the security domain.
     */
    def 'unsetEnforceJava2Security'(Boolean value) {
        parameter("unsetEnforceJava2Security", value)
    }

    /**
     * Unset the enforce fine grain security value
     */
    def 'unsetEnforceFineGrainedJCASecurity'(Boolean value) {
        parameter("unsetEnforceFineGrainedJCASecurity", value)
    }

    /**
     * Unset the issue permission warning value on the security domain.
     */
    def 'unsetIssuePermissionWarning'(Boolean value) {
        parameter("unsetIssuePermissionWarning", value)
    }

    /**
     * Unset the cache timeout value on the security domain.
     */
    def 'unsetCacheTimeout'(Boolean value) {
        parameter("unsetCacheTimeout", value)
    }

}
