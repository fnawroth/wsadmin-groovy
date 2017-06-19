/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command performs the tasks necessary to fully configure the Tivoli Access Manager Runtime for Java. The specific tasks run are PDJrteCfg and SvrSslCfg.
*/
@Generated("with GenerateAdminCommands")
class ConfigureTAMTAIPdjrteCmd extends AdminCmd<Void> {
    ConfigureTAMTAIPdjrteCmd() {
        super("configureTAMTAIPdjrte")
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
     * Specifies whether to defer the execution of this command at the connected WebSphere Application Server instance until next restart.
     */
    def 'defer'(String value) {
        parameter("defer", value)
    }

}
