/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new WebSphere MQ link.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBMQLinkCmd extends AdminCmd<Void> {
    CreateSIBMQLinkCmd() {
        super("createSIBMQLink")
    }

    /**
     * The name of the bus.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the messaging engine.
     */
    def 'messagingEngine'(String value) {
        parameter("messagingEngine", value)
    }

    /**
     * The name of the WebSphere MQ link.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name of the foreign bus.
     */
    def 'foreignBusName'(String value) {
        parameter("foreignBusName", value)
    }

    /**
     * The name of the queue manager.
     */
    def 'queueManagerName'(String value) {
        parameter("queueManagerName", value)
    }

    /**
     * The name of the sender channel transport chain {OutboundBasicMQLink | OutboundSecureMQLink}.
     */
    def 'senderChannelTransportChain'(String value) {
        parameter("senderChannelTransportChain", value)
    }

    /**
     * The description of the SIB WebSphere MQ link.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Batch size {1 - 9,999} (default is "50").
     */
    def 'batchSize'(Integer value) {
        parameter("batchSize", value)
    }

    /**
     * The maximum message size for the WebSphere MQ link {0 - 104,857,600} (default is "4,194,304").
     */
    def 'maxMsgSize'(Integer value) {
        parameter("maxMsgSize", value)
    }

    /**
     * Heartbeat {0 - 999,999} (default is "300").
     */
    def 'heartBeat'(Integer value) {
        parameter("heartBeat", value)
    }

    /**
     * The sequence wrap value {100 - 999,999,999} (default is "999,999,999").
     */
    def 'sequenceWrap'(Long value) {
        parameter("sequenceWrap", value)
    }

    /**
     * Non-persistent message speed {Fast | Normal} (default is "Fast").
     */
    def 'nonPersistentMessageSpeed'(String value) {
        parameter("nonPersistentMessageSpeed", value)
    }

    /**
     * Adoptable {True | False} (default is "True").
     */
    def 'adoptable'(Boolean value) {
        parameter("adoptable", value)
    }

    /**
     * The initial state of the WebSphere MQ link {Started | Stopped} (default is "Started").
     */
    def 'initialState'(String value) {
        parameter("initialState", value)
    }

    /**
     * The name of the sender channel.
     */
    def 'senderChannelName'(String value) {
        parameter("senderChannelName", value)
    }

    /**
     * Host name.
     */
    def 'hostName'(String value) {
        parameter("hostName", value)
    }

    /**
     * List of connection names for MQLinkSenderChannel in format  hostname1(port1),hostname2(port2) Hostname should be in IPv4 format or dnsname.This value should be specified if senderChannelName is specified, else this is ignored.
     */
    def 'connameList'(String value) {
        parameter("connameList", value)
    }

    /**
     * Port number {0 - 65535} (default is "1414").
     */
    def 'port'(Integer value) {
        parameter("port", value)
    }

    /**
     * Disconnect interval {0 - 999,999} (default is "900").
     */
    def 'discInterval'(Integer value) {
        parameter("discInterval", value)
    }

    /**
     * Short retry count {0 - 999,999,999} (default is "10").
     */
    def 'shortRetryCount'(Integer value) {
        parameter("shortRetryCount", value)
    }

    /**
     * Short retry interval {0 - 999,999,999} (default is "60").
     */
    def 'shortRetryInterval'(Integer value) {
        parameter("shortRetryInterval", value)
    }

    /**
     * Long retry count {0 - 999,999,999} (default is "999,999,999").
     */
    def 'longRetryCount'(Long value) {
        parameter("longRetryCount", value)
    }

    /**
     * Long retry interval {0 - 999,999,999} (default is "1200").
     */
    def 'longRetryInterval'(Long value) {
        parameter("longRetryInterval", value)
    }

    /**
     * The initial state of the sender channel {Started | Stopped} (default is "Started").
     */
    def 'senderChannelInitialState'(String value) {
        parameter("senderChannelInitialState", value)
    }

    /**
     * The name of the receiver channel.
     */
    def 'receiverChannelName'(String value) {
        parameter("receiverChannelName", value)
    }

    /**
     * Inbound Non-persistent reliability {BEST_EFFORT | EXPRESS | RELIABLE} (default is "Reliable").
     */
    def 'inboundNonPersistentReliability'(String value) {
        parameter("inboundNonPersistentReliability", value)
    }

    /**
     * Inbound persistent reliability {Reliable | Assured} (default is "Assured").
     */
    def 'inboundPersistentReliability'(String value) {
        parameter("inboundPersistentReliability", value)
    }

    /**
     * The initial state of the receiver channel {Started | Stopped} (default is "Started").
     */
    def 'receiverChannelInitialState'(String value) {
        parameter("receiverChannelInitialState", value)
    }

    /**
     * The exception destination for the WebSphere MQ link {destination name | $DEFAULT_EXCEPTION_DESTINATION} (default is "$DEFAULT_EXCEPTION_DESTINATION").
     */
    def 'exceptionDestination'(String value) {
        parameter("exceptionDestination", value)
    }

    /**
     * The reliability level at or below which messages that are subject to exception processing will be discarded. Messages above this reliability threshold are handled by the specified exception destination. Allowable values are { BEST_EFFORT_NONPERSISTENT | EXPRESS_NONPERSISTENT | RELIABLE_NONPERSISTENT | RELIABLE_PERSISTENT | ASSURED_PERSISTENT }.
     */
    def 'exceptionDiscardReliability'(String value) {
        parameter("exceptionDiscardReliability", value)
    }

    /**
     * Prefer queue points local to this link's messaging engine
     */
    def 'preferLocal'(Boolean value) {
        parameter("preferLocal", value)
    }

}
