/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures an interceptor.
*/
@Generated("with GenerateAdminCommands")
class ConfigureInterceptorCmd extends AdminCmd<Void> {
    ConfigureInterceptorCmd() {
        super("configureInterceptor")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Class name of the interceptor.
     */
    def 'interceptor'(String value) {
        parameter("interceptor", value)
    }

    /**
     * Specifies a comma separated list of attribute=value custom property pairs to be added to the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

}
