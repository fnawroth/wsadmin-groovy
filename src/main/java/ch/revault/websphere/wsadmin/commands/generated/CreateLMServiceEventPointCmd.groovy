/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "createLMServiceEventPoint" command to create a local mapping service event point, in order to generate service mapping events.
*/
@Generated("with GenerateAdminCommands")
class CreateLMServiceEventPointCmd extends AdminCmd<Void> {
    CreateLMServiceEventPointCmd() {
        super("createLMServiceEventPoint")
    }

    /**
     * The name of the local mapping service to be configured with the event point.
     */
    def 'lmService'(String value) {
        parameter("lmService", value)
    }

    /**
     * A flag to indicate whether the event must be sent. If the flag is true, and the event can not be sent, then the web service request is cancelled.
     */
    def 'mustSend'(String value) {
        parameter("mustSend", value)
    }

    /**
     * A flag to indicate whether the event is sent immediately, or when a global transaction commits. If the flag is true, and a global transaction applies, then the event is sent when the global transaction commits.
     */
    def 'sendAtCommit'(String value) {
        parameter("sendAtCommit", value)
    }

    /**
     * The specification of the event data to be sent in a local mapping service event. Possible values are "NONE", "BODY", "HEADERS", "ENVELOPE". 
     */
    def 'eventData'(String value) {
        parameter("eventData", value)
    }

    /**
     * The JNDI name of the JMS connection factory to be used to publish local mapping service events.
     */
    def 'connectionFactory'(String value) {
        parameter("connectionFactory", value)
    }

    /**
     * The JNDI name of the JMS topic to be used to publish local mapping service events.
     */
    def 'topic'(String value) {
        parameter("topic", value)
    }

}
