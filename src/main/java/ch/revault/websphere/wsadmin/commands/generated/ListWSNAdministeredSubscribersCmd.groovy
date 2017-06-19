/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the WSNAdministeredSubscriber objects in the configuration of the target WSNServicePoint that match the specified input parameters.
*/
@Generated("with GenerateAdminCommands")
class ListWSNAdministeredSubscribersCmd extends AdminCmd<Void> {
    ListWSNAdministeredSubscribersCmd() {
        super("listWSNAdministeredSubscribers")
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
