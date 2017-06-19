/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show a member from a bus.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBusMemberCmd extends AdminCmd<Void> {
    ShowSIBusMemberCmd() {
        super("showSIBusMember")
    }

    /**
     * Name of bus to show member from.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * To specify a server bus member, supply node and server name, but not cluster name or WebSphere MQ server name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To specify a server bus member, supply node and server name, but not cluster name or WebSphere MQ server name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * To specify a cluster bus member, supply cluster name, but not node name, server name or WebSphere MQ server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * To specify an WebSphere MQ server bus member, supply WebSphere MQ server name, but not node name, server name or cluster name.
     */
    def 'wmqServer'(String value) {
        parameter("wmqServer", value)
    }

}
