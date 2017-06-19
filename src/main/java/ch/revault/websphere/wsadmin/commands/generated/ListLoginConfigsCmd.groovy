/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the login module configuration aliases.
*/
@Generated("with GenerateAdminCommands")
class ListLoginConfigsCmd extends AdminCmd<Void> {
    ListLoginConfigsCmd() {
        super("listLoginConfigs")
    }

    /**
     * Enter a login module type. Valid types are: system and application.
     */
    def 'loginModuleType'(String value) {
        parameter("loginModuleType", value)
    }

}
