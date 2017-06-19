/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the current JVM mode. The command will return either 31-bit or 64-bit.
*/
@Generated("with GenerateAdminCommands")
class GetJVMModeCmd extends AdminCmd<Void> {
    GetJVMModeCmd() {
        super("getJVMMode")
    }

    /**
     * Server to get JVM mode from. Required if target object is not specified.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * Node to get JVM mode from. Required if target object is not specified.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
