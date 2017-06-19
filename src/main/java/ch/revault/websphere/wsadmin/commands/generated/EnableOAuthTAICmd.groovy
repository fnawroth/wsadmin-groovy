/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Enable OAuth TAI
*/
@Generated("with GenerateAdminCommands")
class EnableOAuthTAICmd extends AdminCmd<Void> {
    EnableOAuthTAICmd() {
        super("enableOAuthTAI")
    }

    /**
     * Security Domain Name
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
