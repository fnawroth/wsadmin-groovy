/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configure the Jaspi configuration.
*/
@Generated("with GenerateAdminCommands")
class ConfigureJaspiCmd extends AdminCmd<Void> {
    ConfigureJaspiCmd() {
        super("configureJaspi")
    }

    /**
     * Specify the name of the security domain.
     */
    def 'securityDomainName'(java.lang.String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify true to enable the Jaspi configuration and false to disable the Jaspi configuration.
     */
    def 'enabled'(java.lang.Boolean value) {
        parameter("enabled", value)
    }

    /**
     * The name of the default authentication provider.
     */
    def 'defaultProviderName'(java.lang.String value) {
        parameter("defaultProviderName", value)
    }

}
