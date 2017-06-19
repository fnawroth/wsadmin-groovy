/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command modifies the configuration for embedded Tivoli Access Manager on the WebSphere Application Server node or nodes specified.
*/
@Generated("with GenerateAdminCommands")
class ModifyTAMCmd extends AdminCmd<Void> {
    ModifyTAMCmd() {
        super("modifyTAM")
    }

    /**
     * Specifies the target WebSphere Application Server node or nodes. Specify all nodes by entering '*'.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Specifies the Tivoli Access Manager administrator's user name.
     */
    def 'adminUid'(String value) {
        parameter("adminUid", value)
    }

    /**
     * Specifies the Tivoli Access Manager administrator's user password.
     */
    def 'adminPasswd'(String value) {
        parameter("adminPasswd", value)
    }

}
