/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Checks if the provided runas user is valid.  True is return if the runas user is valid and false if it is not. 
*/
@Generated("with GenerateAdminCommands")
class CheckRegistryRunAsUserCmd extends AdminCmd<Void> {
    CheckRegistryRunAsUserCmd() {
        super("checkRegistryRunAsUser")
    }

    /**
     * Specifies the name of the security realm to check the runas user in.
     */
    def 'realmName'(String value) {
        parameter("realmName", value)
    }

    /**
     * Specifies the name of the resource to check the runas user in.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

    /**
     * Specifies the name of the security domain to check the runas user in.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Pipe separated list of users to check the runas user against.
     */
    def 'userList'(String value) {
        parameter("userList", value)
    }

    /**
     * Pipe separated list of groups to check the runas user against.
     */
    def 'groupList'(String value) {
        parameter("groupList", value)
    }

    /**
     * The name of the runas user to check
     */
    def 'username'(String value) {
        parameter("username", value)
    }

}
