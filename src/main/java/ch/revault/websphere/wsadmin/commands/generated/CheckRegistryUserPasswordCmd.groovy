/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Check if the provided user and password authenticate in the registry.
*/
@Generated("with GenerateAdminCommands")
class CheckRegistryUserPasswordCmd extends AdminCmd<Void> {
    CheckRegistryUserPasswordCmd() {
        super("checkRegistryUserPassword")
    }

    /**
     * Specifies the name of the security realm to check the user password in.
     */
    def 'realmName'(String value) {
        parameter("realmName", value)
    }

    /**
     * Specifies the name of the resource to check the user password in.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

    /**
     * Specifies the name of the security domain to check the user password in.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * userNameCheckDesc
     */
    def 'username'(String value) {
        parameter("username", value)
    }

    /**
     * Specifies the password to be check in the realm.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
