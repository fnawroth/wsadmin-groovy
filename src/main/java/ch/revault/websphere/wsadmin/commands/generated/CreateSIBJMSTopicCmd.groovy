/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a SIB JMS topic at the scope identified by the target object.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBJMSTopicCmd extends AdminCmd<Void> {
    CreateSIBJMSTopicCmd() {
        super("createSIBJMSTopic")
    }

    /**
     * The SIB JMS topic's name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The SIB JMS topic's JNDI name.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * A description of the SIB JMS topic.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The name of the underlying SIB topic space to which the topic points.
     */
    def 'topicSpace'(String value) {
        parameter("topicSpace", value)
    }

    /**
     * The topic to be used inside the topic space (for example, stock/IBM).
     */
    def 'topicName'(String value) {
        parameter("topicName", value)
    }

    /**
     * The delivery mode for messages. Legal values are "Application", "NonPersistent" and "Persistent".
     */
    def 'deliveryMode'(String value) {
        parameter("deliveryMode", value)
    }

    /**
     * The time in milliseconds to be used for message expiration.
     */
    def 'timeToLive'(Long value) {
        parameter("timeToLive", value)
    }

    /**
     * The priority for messages. Whole number in the range 0 to 9.
     */
    def 'priority'(Integer value) {
        parameter("priority", value)
    }

    /**
     * Read-ahead value. Legal values are "AsConnection", "AlwaysOn" and "AlwaysOff".
     */
    def 'readAhead'(String value) {
        parameter("readAhead", value)
    }

    /**
     * The name of the bus on which the topic resides.
     */
    def 'busName'(String value) {
        parameter("busName", value)
    }

}
