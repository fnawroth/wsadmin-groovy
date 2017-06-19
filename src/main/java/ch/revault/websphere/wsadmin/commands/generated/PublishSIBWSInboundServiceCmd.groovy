/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Publish an inbound service to a UDDI registry.
*/
@Generated("with GenerateAdminCommands")
class PublishSIBWSInboundServiceCmd extends AdminCmd<Void> {
    PublishSIBWSInboundServiceCmd() {
        super("publishSIBWSInboundService")
    }

    /**
     * Name of a UDDI publication for the inbound service.
     */
    def 'uddiPublication'(String value) {
        parameter("uddiPublication", value)
    }

    /**
     * User ID to be used if publishing is done through an authenticating proxy.
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * Password to be used if publishing is done through an authenticating proxy.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
