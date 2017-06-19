/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show the properties of a WSNAdministeredSubscriber object in a human readable form.
*/
@Generated("with GenerateAdminCommands")
class ShowWSNAdministeredSubscriberCmd extends AdminCmd<Void> {
    ShowWSNAdministeredSubscriberCmd() {
        super("showWSNAdministeredSubscriber")
    }

    /**
     * Endpoint
     */
    def 'endpoint'(String value) {
        parameter("endpoint", value)
    }

    /**
     * Topic
     */
    def 'topic'(String value) {
        parameter("topic", value)
    }

    /**
     * Dialect
     */
    def 'dialect'(String value) {
        parameter("dialect", value)
    }

    /**
     * Namespace
     */
    def 'namespace'(String value) {
        parameter("namespace", value)
    }

}
