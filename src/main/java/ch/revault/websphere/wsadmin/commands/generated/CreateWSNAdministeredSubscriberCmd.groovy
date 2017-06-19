/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add an administered subscriber to a WS-Notification service point
*/
@Generated("with GenerateAdminCommands")
class CreateWSNAdministeredSubscriberCmd extends AdminCmd<Void> {
    CreateWSNAdministeredSubscriberCmd() {
        super("createWSNAdministeredSubscriber")
    }

    /**
     * Endpoint
     */
    def 'endpoint'(String value) {
        parameter("endpoint", value)
    }

    /**
     * Topic expression
     */
    def 'topic'(String value) {
        parameter("topic", value)
    }

    /**
     * Dialect expression
     */
    def 'dialect'(String value) {
        parameter("dialect", value)
    }

    /**
     * Topic namespace
     */
    def 'topicNamespace'(String value) {
        parameter("topicNamespace", value)
    }

    /**
     * Remote subscription timeout
     */
    def 'remoteSubscriptionTimeout'(Integer value) {
        parameter("remoteSubscriptionTimeout", value)
    }

}
