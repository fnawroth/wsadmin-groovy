/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command unconfigures the embedded Tivoli Access Manager Trust Association Interceptor with classname TAMTrustAsociationInterceptorPlus. This task does not include removing any custom properties from the security configuration
*/
@Generated("with GenerateAdminCommands")
class UnconfigureTAMTAICmd extends AdminCmd<Void> {
    UnconfigureTAMTAICmd() {
        super("unconfigureTAMTAI")
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
