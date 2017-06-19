/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the security attributes on the global administrative security configuration.
*/
@Generated("with GenerateAdminCommands")
class SetAdminActiveSecuritySettingsCmd extends AdminCmd<Void> {
    SetAdminActiveSecuritySettingsCmd() {
        super("setAdminActiveSecuritySettings")
    }

    /**
     * Specify true to enable administrative security and false to disable administrative security.
     */
    def 'enableGlobalSecurity'(Boolean value) {
        parameter("enableGlobalSecurity", value)
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
     * Specify true to read SSL configuration changes dynamically and false to have SSL configuration changes read on server startup.
     */
    def 'dynUpdateSSLConfig'(Boolean value) {
        parameter("dynUpdateSSLConfig", value)
    }

    /**
     * Specify the active authentication mechanism. Valid values are LTPA, KRB5.
     */
    def 'activeAuthMechanism'(String value) {
        parameter("activeAuthMechanism", value)
    }

    /**
     * Specify the administrative preferred active authentication mechanism
     */
    def 'adminPreferredAuthMech'(String value) {
        parameter("adminPreferredAuthMech", value)
    }

    /**
     * Specifies the administrative security active user registry.
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
     * Specifies a comma separated list of attribute=value custom property pairs to be added to the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

}
