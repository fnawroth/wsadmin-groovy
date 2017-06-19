/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configure single signon.
*/
@Generated("with GenerateAdminCommands")
class ConfigureSingleSignonCmd extends AdminCmd<Void> {
    ConfigureSingleSignonCmd() {
        super("configureSingleSignon")
    }

    /**
     * Set to enable or disable single signon.
     */
    def 'enable'(Boolean value) {
        parameter("enable", value)
    }

    /**
     * Set if SSL is required.
     */
    def 'requiresSSL'(Boolean value) {
        parameter("requiresSSL", value)
    }

    /**
     * Configures the domain for single signon.
     */
    def 'domainName'(String value) {
        parameter("domainName", value)
    }

    /**
     * Set the single signon interoperability mode.
     */
    def 'interoperable'(Boolean value) {
        parameter("interoperable", value)
    }

    /**
     * Configures single signon attribute propagation.
     */
    def 'attributePropagation'(Boolean value) {
        parameter("attributePropagation", value)
    }

}
