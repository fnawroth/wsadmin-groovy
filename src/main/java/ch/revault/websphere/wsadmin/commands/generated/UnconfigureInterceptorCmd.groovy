/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes an interceptor from global security configuration or from a security domain.
*/
@Generated("with GenerateAdminCommands")
class UnconfigureInterceptorCmd extends AdminCmd<Void> {
    UnconfigureInterceptorCmd() {
        super("unconfigureInterceptor")
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

}
