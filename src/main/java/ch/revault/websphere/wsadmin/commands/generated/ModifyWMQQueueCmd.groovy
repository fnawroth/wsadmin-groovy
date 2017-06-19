/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the properties of the IBM MQ Queue provided to the command.
*/
@Generated("with GenerateAdminCommands")
class ModifyWMQQueueCmd extends AdminCmd<Void> {
    ModifyWMQQueueCmd() {
        super("modifyWMQQueue")
    }

    /**
     * The administrative name to assign to the IBM MQ JMS queue type destination.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name used to bind this IBM MQ JMS queue type destination into WebSphere Application Server JNDI.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * The name of the IBM MQ queue that will be used to store messages for the IBM MQ JMS queue type destination definition.
     */
    def 'queueName'(String value) {
        parameter("queueName", value)
    }

    /**
     * An administrative description to associate with this IBM MQ JMS queue type destination.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The queue manager on which the IBM MQ queue resides.
     */
    def 'qmgr'(String value) {
        parameter("qmgr", value)
    }

    /**
     * Determines the level of persistence used to store messages sent to this destination. Legal values are "APP", "QDEF", "PERS", "NON" or "HIGH".
     */
    def 'persistence'(String value) {
        parameter("persistence", value)
    }

    /**
     * The priority level to assign to messages sent to this destination. Legal values are "APP", "QDEF", "0", "1", "2", "3", "4", "5", "6", "7", "8", or "9".
     */
    def 'priority'(String value) {
        parameter("priority", value)
    }

    /**
     * The amount of time after which messages, sent to this destination, expire and are dealt with as per their disposition options. Legal values are "APP", "UNLIM" or any positive integer.
     */
    def 'expiry'(String value) {
        parameter("expiry", value)
    }

    /**
     * The coded character set identifier.
     */
    def 'ccsid'(String value) {
        parameter("ccsid", value)
    }

    /**
     * Use the native encoding settings on this queue.
     */
    def 'useNativeEncoding'(Boolean value) {
        parameter("useNativeEncoding", value)
    }

    /**
     * The integer encoding setting for this queue. Legal values are "Normal" and "Reversed".
     */
    def 'integerEncoding'(String value) {
        parameter("integerEncoding", value)
    }

    /**
     * The decimal encoding setting for this queue. Legal values are "Normal" and "Reversed".
     */
    def 'decimalEncoding'(String value) {
        parameter("decimalEncoding", value)
    }

    /**
     * The floating point encoding setting for this queue. Legal values are "IEEENormal", "IEEEReversed" and "z/OS".
     */
    def 'floatingPointEncoding'(String value) {
        parameter("floatingPointEncoding", value)
    }

    /**
     * Determines whether a RFH version 2 header is appended to messages sent to this destination. Legal values are "true" or "false".
     */
    def 'useRFH2'(Boolean value) {
        parameter("useRFH2", value)
    }

    /**
     * Determines if messages can be sent to this destination without requiring that the queue manager acknowledges they have arrived. Legal values are "YES", "NO" or "QDEF".
     */
    def 'sendAsync'(String value) {
        parameter("sendAsync", value)
    }

    /**
     * Determines if messages, for non-persistent consumers, can be read ahead and cached. Legal values are "YES", "NO" or "QDEF".
     */
    def 'readAhead'(String value) {
        parameter("readAhead", value)
    }

    /**
     * This property determines the behaviour that occurs when closing a message consumer that is receiving messages asynchronously using a message listener from a destination that has the "readAhead" parameter set to true. When a value of "DELIVERALL" is specified the close method invocation will wait until all "read-ahead" messages are delivered to the consumer before closing it.  When a value of "DELIVERCURRENT" is specified then the close() method will only wait for any in-progress delivery to end before closing the consumer. Legal values are "DELIVERALL" and "DELIVERCURRENT".
     */
    def 'readAheadClose'(String value) {
        parameter("readAheadClose", value)
    }

    /**
     * Specifies whether an application can read the values of MQMD fields from JMS messages that have been sent or received using the IBM MQ messaging provider. Legal values are "true" or "false".
     */
    def 'mqmdReadEnabled'(Boolean value) {
        parameter("mqmdReadEnabled", value)
    }

    /**
     * Specifies whether an application can set the values of MQMD fields in JMS messages that will be sent or received using the IBM MQ messaging provider. Legal values are "true" or "false".
     */
    def 'mqmdWriteEnabled'(Boolean value) {
        parameter("mqmdWriteEnabled", value)
    }

    /**
     * Defines the message context options specified when sending messages to a destination. Legal values are "DEFAULT", "SET_IDENTITY_CONTEXT" or "SET_ALL_CONTEXT".
     */
    def 'mqmdMessageContext'(String value) {
        parameter("mqmdMessageContext", value)
    }

    /**
     * Specifies whether an application processes the RFH version 2 header of a IBM MQ message as part of the JMS message body. Legal values are "UNSPECIFIED", "JMS" or "MQ".
     */
    def 'messageBody'(String value) {
        parameter("messageBody", value)
    }

    /**
     * Specifies how the JMSReplyTo header field in a IBM MQ messaging provider message is generated. Legal values are "DEFAULT", "MQMD" or "RFH2".  
     */
    def 'replyToStyle'(String value) {
        parameter("replyToStyle", value)
    }

}
