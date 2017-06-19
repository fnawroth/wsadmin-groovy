/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* null
*/
@Generated("with GenerateAdminCommands")
class SetClusterMemberLimitCmd extends AdminCmd<Void> {
    SetClusterMemberLimitCmd() {
        super("setClusterMemberLimit")
    }

    /**
     * null
     */
    def 'numMembers'(Short value) {
        parameter("numMembers", value)
    }

}
