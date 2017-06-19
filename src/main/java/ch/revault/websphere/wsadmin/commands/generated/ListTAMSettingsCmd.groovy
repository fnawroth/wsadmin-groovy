/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command lists the current embedded Tivoli Access Manager configuration settings.
*/
@Generated("with GenerateAdminCommands")
class ListTAMSettingsCmd extends AdminCmd<Void> {
    ListTAMSettingsCmd() {
        super("listTAMSettings")
    }

    /**
     * Specifies the target WebSphere Application Server node or nodes. Specify all nodes by entering '*'.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
