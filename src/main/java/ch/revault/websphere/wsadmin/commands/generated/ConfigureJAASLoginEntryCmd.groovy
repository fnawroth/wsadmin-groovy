/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures a JAAS login module entry in the administrative security configuration or in an application security domain.
*/
@Generated("with GenerateAdminCommands")
class ConfigureJAASLoginEntryCmd extends AdminCmd<Void> {
    ConfigureJAASLoginEntryCmd() {
        super("configureJAASLoginEntry")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specifies the login module type.  Valid values are: system, application
     */
    def 'loginType'(String value) {
        parameter("loginType", value)
    }

    /**
     * The alias name that identifies the login module entry.
     */
    def 'loginEntryAlias'(String value) {
        parameter("loginEntryAlias", value)
    }

    /**
     * A comma separated list of login module class file names
     */
    def 'loginModules'(String value) {
        parameter("loginModules", value)
    }

    /**
     * A comma separated list of authentication strategies, must have one for each login module.
     */
    def 'authStrategies'(String value) {
        parameter("authStrategies", value)
    }

}
