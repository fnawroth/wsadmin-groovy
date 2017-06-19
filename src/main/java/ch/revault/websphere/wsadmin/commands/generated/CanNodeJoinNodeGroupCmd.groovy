/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Check if a specified node can be added to a specified node group.
*/
@Generated("with GenerateAdminCommands")
class CanNodeJoinNodeGroupCmd extends AdminCmd<Void> {
    CanNodeJoinNodeGroupCmd() {
        super("canNodeJoinNodeGroup")
    }

    /**
     * The name of the node to check about adding.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The name of the operating system that the node is on.
     */
    def 'platform'(String value) {
        parameter("platform", value)
    }

    /**
     * The WebSphere Application Server version of the node.
     */
    def 'version'(String value) {
        parameter("version", value)
    }

    /**
     * The name of the sysplex. This is for z/OS only.
     */
    def 'sysplexName'(String value) {
        parameter("sysplexName", value)
    }

    /**
     * The name of the node group to check about adding the node to.
     */
    def 'nodeGroupName'(String value) {
        parameter("nodeGroupName", value)
    }

}
