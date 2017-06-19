/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add an outbound port to an outbound service.
*/
@Generated("with GenerateAdminCommands")
class AddSIBWSOutboundPortCmd extends AdminCmd<Void> {
    AddSIBWSOutboundPortCmd() {
        super("addSIBWSOutboundPort")
    }

    /**
     * Name of the outbound port in the service WSDL.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name of the node to which the port will be assigned.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * Name of the server to which the port will be assigned.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * Name of the cluster to which the port will be assigned.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * Name to use for the associated port destination.
     */
    def 'destination'(String value) {
        parameter("destination", value)
    }

    /**
     * User ID to be used if WSDL is obtained through an authorizing proxy.
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * Password to be used if WSDL is obtained through an authorizing proxy.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
