/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Changes the password of this logged-in user.
*/
@Generated("with GenerateAdminCommands")
class ChangeMyPasswordCmd extends AdminCmd<Void> {
    ChangeMyPasswordCmd() {
        super("changeMyPassword")
    }

    /**
     * The old password of this logged-in user, which must be the same as the password in the repository. 
     */
    def 'oldPassword'(String value) {
        parameter("oldPassword", value)
    }

    /**
     * The new password of this logged-in user.
     */
    def 'newPassword'(String value) {
        parameter("newPassword", value)
    }

    /**
     * Used to guarantee and confirm that the confirmNewPassword is the same as the newPassword.
     */
    def 'confirmNewPassword'(String value) {
        parameter("confirmNewPassword", value)
    }

}
