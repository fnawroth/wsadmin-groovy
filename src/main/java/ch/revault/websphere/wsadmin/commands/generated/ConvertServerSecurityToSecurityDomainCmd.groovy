/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Task to convert server level security configuration to a security domain configuration.
*/
@Generated("with GenerateAdminCommands")
class ConvertServerSecurityToSecurityDomainCmd extends AdminCmd<Void> {
    ConvertServerSecurityToSecurityDomainCmd() {
        super("convertServerSecurityToSecurityDomain")
    }

    /**
     * The server resource whose server level security configuration will be converted to a security domain.
     */
    def 'serverResource'(String value) {
        parameter("serverResource", value)
    }

    /**
     * The unique name of the newly created security domain where the server level security configuration will be converted to.
     */
    def 'securityDomain'(String value) {
        parameter("securityDomain", value)
    }

    /**
     * Description of the security domain.
     */
    def 'securityDomainDescription'(String value) {
        parameter("securityDomainDescription", value)
    }

    /**
     * Specify true to delete the server level security configuration or specify false to leave the security configuration around.
     */
    def 'deleteServer'(Boolean value) {
        parameter("deleteServer", value)
    }

}
