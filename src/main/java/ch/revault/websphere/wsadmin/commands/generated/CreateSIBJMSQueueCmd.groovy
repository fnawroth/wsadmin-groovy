/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a SIB JMS queue at the scope identified by the target object.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBJMSQueueCmd extends AdminCmd<Void> {
    CreateSIBJMSQueueCmd() {
        super("createSIBJMSQueue")
    }

    /**
     * The SIB JMS queue's name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The SIB JMS queue's JNDI name.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * A description of the SIB JMS queue.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The name of the underlying SIB queue to which the queue points.
     */
    def 'queueName'(String value) {
        parameter("queueName", value)
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
     * The name of the bus on which the queue resides.
     */
    def 'busName'(String value) {
        parameter("busName", value)
    }

    /**
     * Indicates if the underlying SIB queue destination should be scoped to a local queue point when addressed using this JMS queue
     */
    def 'scopeToLocalQP'(Boolean value) {
        parameter("scopeToLocalQP", value)
    }

    /**
     * Indicates how JMS producers should bind to queue points of the clustered queue. TRUE indicates that a queue point should be chosen when the session is opened and should never change, FALSE indicates that a queue point should be chosen every time a message is sent.
     */
    def 'producerBind'(Boolean value) {
        parameter("producerBind", value)
    }

    /**
     * Indicates whether queue points local to the producer should be used
     */
    def 'producerPreferLocal'(Boolean value) {
        parameter("producerPreferLocal", value)
    }

    /**
     * Indicates whether JMS consumers and browsers should be given messages from any queue points, rather than the single queue point that they are attached to.
     */
    def 'gatherMessages'(Boolean value) {
        parameter("gatherMessages", value)
    }

}
