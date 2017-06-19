/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a PersonAccount in the default realm.
*/
@Generated("with GenerateAdminCommands")
class CreateUserCmd extends AdminCmd<Void> {
    CreateUserCmd() {
        super("createUser")
    }

    /**
     * The UID of the PersonAccount.
     */
    def 'uid'(String value) {
        parameter("uid", value)
    }

    /**
     * The password of the user.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * The surname of the entity.
     */
    def 'sn'(String value) {
        parameter("sn", value)
    }

    /**
     * The common name of the entity.
     */
    def 'cn'(String value) {
        parameter("cn", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Used to guarantee and confirm that the confirmPassword is the same as the password.
     */
    def 'confirmPassword'(String value) {
        parameter("confirmPassword", value)
    }

    /**
     * The e-mail address of the PersonAccount.
     */
    def 'mail'(String value) {
        parameter("mail", value)
    }

    /**
     * The parent of the entity.
     */
    def 'parent'(String value) {
        parameter("parent", value)
    }

}
