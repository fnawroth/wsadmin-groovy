/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify an existing SIB link.
*/
@Generated("with GenerateAdminCommands")
class ModifySIBLinkCmd extends AdminCmd<Void> {
    ModifySIBLinkCmd() {
        super("modifySIBLink")
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
     * The name of the SIB link.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name of the bootstrap endpoints.
     */
    def 'bootstrapEndpoints'(String value) {
        parameter("bootstrapEndpoints", value)
    }

    /**
     * The name of the remote messaging engine.
     */
    def 'remoteMessagingEngineName'(String value) {
        parameter("remoteMessagingEngineName", value)
    }

    /**
     * The description of the SIB link.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The name of the protocol.
     */
    def 'protocolName'(String value) {
        parameter("protocolName", value)
    }

    /**
     * The name of the authentication alias.
     */
    def 'authAlias'(String value) {
        parameter("authAlias", value)
    }

    /**
     * The initial state of the SIB link {Started | Stopped} (default is "Started").
     */
    def 'initialState'(String value) {
        parameter("initialState", value)
    }

    /**
     * The exception destination for the SIB link {destination name | $DEFAULT_EXCEPTION_DESTINATION} (default is "$DEFAULT_EXCEPTION_DESTINATION").
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
