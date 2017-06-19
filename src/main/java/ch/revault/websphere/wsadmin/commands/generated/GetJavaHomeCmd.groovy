/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the Java Home path.
*/
@Generated("with GenerateAdminCommands")
class GetJavaHomeCmd extends AdminCmd<Void> {
    GetJavaHomeCmd() {
        super("getJavaHome")
    }

    /**
     * The name of the server. This parameter will be ignored (but is still required) if there is only one server in the entire configuration.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The name of the node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The JVM mode, which is either "31bit" or "64bit" for a release prior to V9. Starting from V9, only 64-bit mode is supported.
     */
    def 'mode'(String value) {
        parameter("mode", value)
    }

}
