/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the JVM mode to either 64-bit or 31-bit for a release prior to V9. Starting from V9, only 64-bit is supported.
*/
@Generated("with GenerateAdminCommands")
class SetJVMModeCmd extends AdminCmd<Void> {
    SetJVMModeCmd() {
        super("setJVMMode")
    }

    /**
     * Server to set JVM mode on. Required if target object is not specified.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * Node to set JVM mode on. Required if target object is not specified.
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
