/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Allows the override for sender inheritance for an individual topic on a specified topic space.  Setting the "inherit" value to true will allow the topic to inherit from the default values.
*/
@Generated("with GenerateAdminCommands")
class SetInheritSenderForTopicCmd extends AdminCmd<Void> {
    SetInheritSenderForTopicCmd() {
        super("setInheritSenderForTopic")
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

    /**
     * Inherit sender defaults (True by default)
     */
    def 'inherit'(Boolean value) {
        parameter("inherit", value)
    }

}
