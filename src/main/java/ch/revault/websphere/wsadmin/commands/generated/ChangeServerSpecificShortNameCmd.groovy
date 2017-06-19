/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* A command that can be used to change the server specific short name. 
*/
@Generated("with GenerateAdminCommands")
class ChangeServerSpecificShortNameCmd extends AdminCmd<Void> {
    ChangeServerSpecificShortNameCmd() {
        super("changeServerSpecificShortName")
    }

    /**
     * The Server Name
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The Node Name
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The server specific short name is applicable only on zOS platforms. This represents the specific short name of the server. All servers should have unique specific short name. This parameter is optional and when it is not specified a unique specific short name is automatically assigned. The value should be 8 chars or less and all upper case. 
     */
    def 'specificShortName'(String value) {
        parameter("specificShortName", value)
    }

}
