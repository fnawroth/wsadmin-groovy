/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the auditor password in the audit.xml file.
*/
@Generated("with GenerateAdminCommands")
class SetAuditorPwdCmd extends AdminCmd<Void> {
    SetAuditorPwdCmd() {
        super("setAuditorPwd")
    }

    /**
     * Supply the password of the auditor identity.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
