/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a messaging engine.
*/
@Generated("with GenerateAdminCommands")
class ModifySIBEngineCmd extends AdminCmd<Void> {
    ModifySIBEngineCmd() {
        super("modifySIBEngine")
    }

    /**
     * The name of the bus to which the messaging engine is to belong.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * To modify a messaging engine on a server, supply node and server name, but not cluster name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To modify a messaging engine on a server, supply node and server name, but not cluster name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To modify a messaging engine on a cluster, supply cluster name, but not node and server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * The name of the messaging engine to be modified.
     */
    def 'engine'(String value) {
        parameter("engine", value)
    }

    /**
     * Description of the messaging engine.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Whether the messaging engine is started or stopped when the associated application server is first started. Until started, the messaging engine is unavailable. (Stopped | Started).
     */
    def 'initialState'(String value) {
        parameter("initialState", value)
    }

    /**
     * The maximum total number of messages that the messaging engine can place on its message points.
     */
    def 'highMessageThreshold'(java.lang.Long value) {
        parameter("highMessageThreshold", value)
    }

    /**
     * The default blocked retry interval for destinations owned by this messaging engine.
     */
    def 'defaultBlockedRetryTimeout'(java.lang.Long value) {
        parameter("defaultBlockedRetryTimeout", value)
    }

    /**
     * Select this option to restrict the messaging engine from holding long enduring database locks.
     */
    def 'restrictLongDBLock'(Boolean value) {
        parameter("restrictLongDBLock", value)
    }

}
