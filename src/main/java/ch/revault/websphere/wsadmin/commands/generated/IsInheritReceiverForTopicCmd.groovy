/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Shows the inherit receiver defaults for a topic in a given topic space.  Returns "true" if the topic inherits from receiver default values.
*/
@Generated("with GenerateAdminCommands")
class IsInheritReceiverForTopicCmd extends AdminCmd<Void> {
    IsInheritReceiverForTopicCmd() {
        super("isInheritReceiverForTopic")
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
