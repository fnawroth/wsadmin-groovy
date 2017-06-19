/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Shows the inherit sender defaults for a topic for a specified topic space.  Returns "true" if the topic inherits from sender default values.
*/
@Generated("with GenerateAdminCommands")
class IsInheritSenderForTopicCmd extends AdminCmd<Void> {
    IsInheritSenderForTopicCmd() {
        super("isInheritSenderForTopic")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Topicspace name
     */
    def 'topicSpace'(String value) {
        parameter("topicSpace", value)
    }

    /**
     * Topic name
     */
    def 'topic'(String value) {
        parameter("topic", value)
    }

}
