/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the LTPA authentication mechanism timeout from global security or an application security domain.
*/
@Generated("with GenerateAdminCommands")
class SetLTPATimeoutCmd extends AdminCmd<Void> {
    SetLTPATimeoutCmd() {
        super("setLTPATimeout")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The LTPA timeout period for global security or an application security domain.
     */
    def 'timeout'(String value) {
        parameter("timeout", value)
    }

}
