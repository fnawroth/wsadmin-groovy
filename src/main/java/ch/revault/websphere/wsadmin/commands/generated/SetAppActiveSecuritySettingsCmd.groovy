/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the application level security active settings.
*/
@Generated("with GenerateAdminCommands")
class SetAppActiveSecuritySettingsCmd extends AdminCmd<Void> {
    SetAppActiveSecuritySettingsCmd() {
        super("setAppActiveSecuritySettings")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The period of time in seconds after which the authentication data will not be valid.
     */
    def 'cacheTimeout'(Integer value) {
        parameter("cacheTimeout", value)
    }

    /**
     * Specify true for a warning to be issued during application installation if the application requires Java2 security permissions and false for no warning.
     */
    def 'issuePermissionWarning'(Boolean value) {
        parameter("issuePermissionWarning", value)
    }

    /**
     * Specify true to enable Java 2 security permissions checking and false to disable Java 2 security.
     */
    def 'enforceJava2Security'(Boolean value) {
        parameter("enforceJava2Security", value)
    }

    /**
     * Specify true to restrict application access to sensitive Java Connector Architecture (JCA) mapping authentication data.
     */
    def 'enforceFineGrainedJCASecurity'(Boolean value) {
        parameter("enforceFineGrainedJCASecurity", value)
    }

    /**
     * Specify true to enable application-level security and false to disable application-level security.
     */
    def 'appSecurityEnabled'(Boolean value) {
        parameter("appSecurityEnabled", value)
    }

    /**
     * Specifies the server active user registry.
     */
    def 'activeUserRegistry'(String value) {
        parameter("activeUserRegistry", value)
    }

    /**
     * Specify true to use domain qualified user names and false to use the short name.
     */
    def 'useDomainQualifiedUserNames'(Boolean value) {
        parameter("useDomainQualifiedUserNames", value)
    }

    /**
     * Add, modify, or remove custom properties on the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

}
