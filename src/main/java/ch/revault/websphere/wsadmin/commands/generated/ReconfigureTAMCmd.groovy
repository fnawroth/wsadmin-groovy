/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command configures embedded Tivoli Access Manager on the WebSphere Application Server node or nodes specified.
*/
@Generated("with GenerateAdminCommands")
class ReconfigureTAMCmd extends AdminCmd<Void> {
    ReconfigureTAMCmd() {
        super("reconfigureTAM")
    }

    /**
     * Specifies the target WebSphere Application Server node or nodes. Specify all nodes by entering '*'.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Specifies the host name and port of the policy server as an entry of the format 'policy-server-host-name:policy-server-port'.
     */
    def 'policySvr'(String value) {
        parameter("policySvr", value)
    }

    /**
     * Specifies the hostname, port and priority of one or more authorization servers as comma-separated entries of the format 'auth-server-host-name:policy-server-port:priority'.
     */
    def 'authSvrs'(String value) {
        parameter("authSvrs", value)
    }

    /**
     * Specifies the WebSphere Application Server administrator's distinguished name.
     */
    def 'wasAdminDN'(String value) {
        parameter("wasAdminDN", value)
    }

    /**
     * Specifies the common distinguished name suffix for all users and groups.
     */
    def 'dnSuffix'(String value) {
        parameter("dnSuffix", value)
    }

    /**
     * Specifies the Tivoli Access Manager administrator's user name.
     */
    def 'adminUid'(String value) {
        parameter("adminUid", value)
    }

    /**
     * Specifies the Tivoli Access Manager administrator's user password.
     */
    def 'adminPasswd'(String value) {
        parameter("adminPasswd", value)
    }

    /**
     * Specifies the Tivoli Access Manager security domain where policy is stored.
     */
    def 'secDomain'(String value) {
        parameter("secDomain", value)
    }

    /**
     * Specifies the TCP/IP ports available as listening ports for embedded Tivoli Access Manager. The ports are entered as a list of comma-separated entries. A range of ports may be specified by separating the range values by a colon. An example entry is, 7999,9000:9999.
     */
    def 'portSet'(String value) {
        parameter("portSet", value)
    }

    /**
     * Specifies whether to ignore errors that might occur during embedded Tivoli Access Manager disablement. Specify this option when the configured Tivoli Access Manager security domain no longer exists or is in a corrupted state.
     */
    def 'force'(String value) {
        parameter("force", value)
    }

    /**
     * Specifies whether to defer the execution of this command at the connected WebSphere Application Server instance until next restart.
     */
    def 'defer'(String value) {
        parameter("defer", value)
    }

}
