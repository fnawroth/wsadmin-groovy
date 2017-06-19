/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an inbound service.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBWSInboundServiceCmd extends AdminCmd<Void> {
    DeleteSIBWSInboundServiceCmd() {
        super("deleteSIBWSInboundService")
    }

    /**
     * User ID to be used if unpublishing is done through an authenticating proxy.
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * Password to be used if unpublishing is done through an authenticating proxy.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
