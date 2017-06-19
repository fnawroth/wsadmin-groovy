/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures a Federated repositories user registry in an application security domain.
*/
@Generated("with GenerateAdminCommands")
class ConfigureAppWIMUserRegistryCmd extends AdminCmd<Void> {
    ConfigureAppWIMUserRegistryCmd() {
        super("configureAppWIMUserRegistry")
    }

    /**
     * Specify if global federated repository should be used as the user regisry.
     */
    def 'useGlobalFederatedRepository'(Boolean value) {
        parameter("useGlobalFederatedRepository", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specifies that a case-insensitive authorization check be performed: true/false.
     */
    def 'ignoreCase'(Boolean value) {
        parameter("ignoreCase", value)
    }

    /**
     * Name of the realm.
     */
    def 'realmName'(String value) {
        parameter("realmName", value)
    }

    /**
     * Add, modify, or remove custom properties on the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

    /**
     * Check that the user registry is configured correctly to perform user registry lookups.
     */
    def 'verifyRegistry'(Boolean value) {
        parameter("verifyRegistry", value)
    }

}
