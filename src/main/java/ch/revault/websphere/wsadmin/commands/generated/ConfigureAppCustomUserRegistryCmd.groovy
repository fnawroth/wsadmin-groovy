/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configure a custom user registry in an application security domain
*/
@Generated("with GenerateAdminCommands")
class ConfigureAppCustomUserRegistryCmd extends AdminCmd<Void> {
    ConfigureAppCustomUserRegistryCmd() {
        super("configureAppCustomUserRegistry")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Name of the realm.
     */
    def 'realmName'(String value) {
        parameter("realmName", value)
    }

    /**
     * Specifies a class name that implements the UserRegistry interface in the com.ibm.websphere.security package.
     */
    def 'customRegClass'(String value) {
        parameter("customRegClass", value)
    }

    /**
     * Specifies that a case-insensitive authorization check be performed: true/false.
     */
    def 'ignoreCase'(Boolean value) {
        parameter("ignoreCase", value)
    }

    /**
     * Check that the user registry is configured correctly to perform user registry lookups.
     */
    def 'verifyRegistry'(Boolean value) {
        parameter("verifyRegistry", value)
    }

    /**
     * Add, modify, or remove custom properties on the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

}
