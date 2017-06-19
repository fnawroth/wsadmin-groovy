/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds an account to the file registry.
*/
@Generated("with GenerateAdminCommands")
class AddFileRegistryAccountCmd extends AdminCmd<Void> {
    AddFileRegistryAccountCmd() {
        super("addFileRegistryAccount")
    }

    /**
     * User's ID
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * User's password
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * User's full name
     */
    def 'fullName'(String value) {
        parameter("fullName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The parent of the entity.
     */
    def 'parent'(String value) {
        parameter("parent", value)
    }

}
