/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create an authentication data entry in the administrative security configuration or a in a security domain.
*/
@Generated("with GenerateAdminCommands")
class CreateAuthDataEntryCmd extends AdminCmd<Void> {
    CreateAuthDataEntryCmd() {
        super("createAuthDataEntry")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The alias of the auth data.
     */
    def 'alias'(String value) {
        parameter("alias", value)
    }

    /**
     * The username of the auth data.
     */
    def 'user'(String value) {
        parameter("user", value)
    }

    /**
     * The password of the auth data.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * The description of the auth data.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
