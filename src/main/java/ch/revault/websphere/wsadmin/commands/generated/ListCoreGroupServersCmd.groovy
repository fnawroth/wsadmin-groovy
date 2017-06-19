/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of core group servers.
*/
@Generated("with GenerateAdminCommands")
class ListCoreGroupServersCmd extends AdminCmd<Void> {
    ListCoreGroupServersCmd() {
        super("listCoreGroupServers")
    }

    /**
     * Core group name
     */
    def 'coreGroupName'(String value) {
        parameter("coreGroupName", value)
    }

}
