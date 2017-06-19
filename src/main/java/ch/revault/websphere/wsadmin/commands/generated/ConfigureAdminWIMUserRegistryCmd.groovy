/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures a Federated repositories user registry in the administrative security configuration.
*/
@Generated("with GenerateAdminCommands")
class ConfigureAdminWIMUserRegistryCmd extends AdminCmd<Void> {
    ConfigureAdminWIMUserRegistryCmd() {
        super("configureAdminWIMUserRegistry")
    }

    /**
     * Automatically generate the server identity used for internal process communication.
     */
    def 'autoGenerateServerId'(Boolean value) {
        parameter("autoGenerateServerId", value)
    }

    /**
     * Server identity used for internal process communications
     */
    def 'serverId'(String value) {
        parameter("serverId", value)
    }

    /**
     * Specifies the password that is used for the server identity.
     */
    def 'serverIdPassword'(String value) {
        parameter("serverIdPassword", value)
    }

    /**
     * Specifies the name of the user with administrative privileges that is defined in the registry.
     */
    def 'primaryAdminId'(String value) {
        parameter("primaryAdminId", value)
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
