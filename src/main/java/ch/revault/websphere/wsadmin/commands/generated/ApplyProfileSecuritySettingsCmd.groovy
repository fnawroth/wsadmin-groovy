/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Applies the security settings selected during install or profile creation time.
*/
@Generated("with GenerateAdminCommands")
class ApplyProfileSecuritySettingsCmd extends AdminCmd<Void> {
    ApplyProfileSecuritySettingsCmd() {
        super("applyProfileSecuritySettings")
    }

    /**
     * Supply a true or false value. Updates the administrative security field in the security.xml based on the user input of either true or false.
     */
    def 'enableAdmin'(String value) {
        parameter("enableAdmin", value)
    }

    /**
     * Supply an administrative user name. 
     */
    def 'adminUser'(String value) {
        parameter("adminUser", value)
    }

    /**
     * Supply an administrative user password.  
     */
    def 'adminPwd'(String value) {
        parameter("adminPwd", value)
    }

}
