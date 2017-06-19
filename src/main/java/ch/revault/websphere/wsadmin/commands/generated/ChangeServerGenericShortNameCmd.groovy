/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* A command that can be used to change the server generic short name. 
*/
@Generated("with GenerateAdminCommands")
class ChangeServerGenericShortNameCmd extends AdminCmd<Void> {
    ChangeServerGenericShortNameCmd() {
        super("changeServerGenericShortName")
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
     * The server generic short name is applicable only on zOS platforms. This represents the generic short name of the server. All members of a cluster should share the same generic short name. Individual servers should have unique generic short name. This parameter is optional and when it is not specified a unique generic short name is automatically assigned. The value should be 8 chars or less and all upper case.
     */
    def 'genericShortName'(String value) {
        parameter("genericShortName", value)
    }

}
