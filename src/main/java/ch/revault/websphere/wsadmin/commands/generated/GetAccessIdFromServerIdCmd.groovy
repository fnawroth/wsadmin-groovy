/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the access ID for the registry server ID.
*/
@Generated("with GenerateAdminCommands")
class GetAccessIdFromServerIdCmd extends AdminCmd<Void> {
    GetAccessIdFromServerIdCmd() {
        super("getAccessIdFromServerId")
    }

    /**
     * Specifies the name of the security realm whose access ID will be returned..
     */
    def 'realmName'(String value) {
        parameter("realmName", value)
    }

}
